package PREGUNTA2;

public class Cliente {

        private Integer codigo;
        private String nombre;
        private String nombreDuenio;
        private String enfermedad;

        public Cliente(Integer codi, String nom, String nomDue, String enfer) {
            this.codigo = codi;
            this.nombre = nom;
            this.nombreDuenio = nomDue;
            this.enfermedad = enfer;
        }

        public Cliente() {

        }

        public Integer getCodigo() {
            return codigo;
        }

        public void setCodigo(Integer codi) {
            this.codigo= codi;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nom) {
            this.nombre= nom;
        }

        public String getNombreDuenio() {
            return nombreDuenio;
        }

        public void setNombreDuenio(String nomDue) {
            this.nombreDuenio= nomDue;
        }
        public String getEnfermedad() {
            return nombre;
        }

        public void setEnfermedad(String enfer) {
            this.enfermedad= enfer;
        }
}