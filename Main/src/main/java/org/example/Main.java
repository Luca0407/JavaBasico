public class Main {
    public static void main(String[] args) {
        class persona(){
            Persona persona = new persona();
            persona.setNombre(nombre = Luca);
            persona.setEdad(edad = 18);
            persona.setTelefono(telefono = 1234567891);

            System.out.prinln(persona.getNombre());
            System.out.prinln(persona.getEdad());
            System.out.prinln(persona.getTelefono());
        }
    }

    class Persona() {
        private int edad;
        private int nombre;
        private int telefono;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }

        public void setNombre(int nombre) {
            this.nombre = nombre;
        }

        public int getNombre() {
            return nombre;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public int getTelefono() {
            return telefono;
        }
    }


}