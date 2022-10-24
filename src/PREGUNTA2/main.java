package PREGUNTA2;

public class main {
    public static void main(String[] args) {
    Veterinaria veterinaria = new Veterinaria();

        veterinaria.setNombre("Patitas Amigas");
        veterinaria.setDireccion("Jr.Aguilar");

        veterinaria.agregarCliente(new Cliente(012,"Fito","Sevastian","Pulgas"));
        veterinaria.agregarCliente(new Cliente(017,"Taylor","Raul","Moquillo"));
        veterinaria.agregarCliente(new Cliente(015,"Judas","Miguel","Rabia"));
        veterinaria.agregarCliente(new Cliente(013,"Boby","Alex","Parasitos"));
        veterinaria.agregarCliente(new Cliente(011,"Balu","Rodrigo","Filarias"));
        veterinaria.agregarCliente(new Cliente(014,"Kira","Freddy","Alergia"));
        veterinaria.agregarCliente(new Cliente(016,"Eliot","Jorge","Cancer"));

        System.out.println("Nombre de tienda: " + veterinaria.getNombre() + ", Direccion: " + veterinaria.getDireccion());


        veterinaria.ordenarCodigo();
}
}
