public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        System.out.println("Datos del cliente");
        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        System.out.println("Datos del trabajador");
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {
    String credito;

    public Cliente() {
        edad = 18;
        nombre = "Luca";
        telefono = "12345676890";
        credito = "$150";
    }
}

class Trabajador extends Persona {
    String salario;

    public Trabajador() {
        edad = 26;
        nombre = "Juan";
        telefono = "9012345678";
        salario = "$100K";
    }
}