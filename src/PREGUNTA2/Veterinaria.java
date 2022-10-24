package PREGUNTA2;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private Cliente cliente[];
    private int contadorCliente;

    public Veterinaria() {
        this.cliente = new Cliente[7];

        this.contadorCliente = 0;
    }
    public Veterinaria(String nombre, String direccion) {
        this.nombre = nombre;

        this.direccion = direccion;
    }
    public void agregarCliente(Cliente cliente){
        this.cliente[contadorCliente++] = cliente;
    }
    public Cliente[] getCliente(){
        return this.cliente;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void ordenarCodigo(){

        Cliente aux;

        for(int i=0; i<7-1; i++){
            for (int j=i+1; j<7; j++) {
                if (cliente[i].getCodigo() > cliente[j].getCodigo()) {
                    aux = cliente[i];
                    cliente[i] = cliente[j];
                    cliente[j] = aux;
                }
            }
        }
        System.out.println("mostrando a los clientes de forma ordenada");
        for(int i=0;i<7;i++){
            System.out.println(" " + cliente[i].getCodigo() + "," + cliente[i].getNombre() + ", " + cliente[i].getNombreDuenio()+", "+ cliente[i].getEnfermedad());
        }
    }
}