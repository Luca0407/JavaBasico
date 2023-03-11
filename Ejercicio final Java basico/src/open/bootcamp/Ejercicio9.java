/**
 * @author Luca Elizondo
 */
package open.bootcamp;

import java.io.*;
import java.util.*;

class Cuenta {
    String userNombre;
    String userContra;
    public Cuenta(String userNombre, String userContra) { //usados en la clase List
        this.userContra = userContra;
        this.userNombre = userNombre;
    }
    public String getUserNombre() {
        return userNombre;
    }
    public String getUserContra() {
        return userContra;
    }
}

public class Ejercicio9 {
    static boolean work = false;
    public static String Username; //declaro estos 2 strings fuera del main
    public static String Password; //para tener mayor libertad en sus usos.
    public static Map<String, String> pase = new HashMap<>();
    public static List<Cuenta> usuario = new ArrayList<>();

    public static void main(String[] args) {
        File Usuario = new File("usuario.txt");
        File Contra = new File("contraseña.txt");

        do { //bucle Do While para repetir el scanner en caso de excepción.
            Scanner scan = new Scanner(System.in);
            System.out.println("Bienvenid@ a SocialMediaGen!\n" + "Inicie sesión [1] o cree una cuenta [2]");
            try { //try catch en caso de excepción
                int accion = scan.nextInt();
                switch (accion) { //inicio switch accion
                    case 1 -> {
                        System.out.println("Introduzca su nombre de usuario");
                        Username = scan.next();
                        System.out.println("Usuario y/o contraseña no reconocido(s), regístrese primero\n");
                    }

                    case 2 -> { //inicio switch accion case 2
                        System.out.println("Escriba un nombre de usuario. Debe tener mínimo 3 caracteres y 8 como máximo");
                        Username = scan.next();
                        if (Username.length() > 8) {
                            System.out.println("Nombre muy largo");
                            break;
                        } else if (Username.length() < 3) {
                            System.out.println("Nombre muy corto");
                            break;
                        }

                        System.out.println("\nIntroduzca una contraseña");
                        Password = scan.next();
                        System.out.println("\nRegistro realizado con éxito! Quiere iniciar sesión?");
                        System.out.println("[1] Sí " + " / " + " [2] No");

                        usuario.add(new Cuenta(Username, Password)); //se agregan los valores a la lista
                        for (Cuenta account : usuario) {
                            pase.put(account.getUserNombre(), account.getUserContra());
                        } //se pasan los valores al mapa

                        int decision = scan.nextInt();
                        switch (decision) {
                            case 1 -> { //inicio switch decision case 1
                                System.out.println("\nBienvenido a SocialMediaGen! Introduzca su nombre de usuario");
                                Username = scan.next();
                                Username = "[" + Username + "]";//esto fue hecho con el fin de hacer funcionar el verifi
                                    if (pase.keySet().toString().contentEquals(Username)) {//cador de datos de entrada.
                                    System.out.println("verificando...");
                                    System.out.println("Usuario valido");
                                } else {
                                        System.out.println("Usuario no reconocido");
                                        break;
                                    }

                                System.out.println("\nIntroduzca su contraseña");
                                Password = scan.next();
                                Password = "[" + Password + "]";
                                    if (Password.contentEquals(pase.values().toString())) {
                                        System.out.println("verificando...");
                                        System.out.println("Contraseña valida");
                                } else {
                                        System.out.println("Contraseña no reconocida");
                                        break;
                                    }

                                System.out.println("\nBienvenid@ de nuevo " + Username + "!!!");
                                System.out.println("¿Quiere guardar los datos de su cuenta? \n");
                                System.out.println("[1] Sí " + " / " + " [2] No");
                                work = true; //work pasa a ser true, por lo que finaliza el ciclo Do While

                                int guardar = scan.nextInt();
                                switch (guardar) {
                                    case 1 -> {
                                        System.out.println("\ncopiando...");
                                        System.out.println("...");
                                        PrintStream salida = new PrintStream(Usuario);
                                        salida.println(Username);
                                        System.out.println("usuario guardado");
                                        PrintStream sali2 = new PrintStream(Contra);
                                        sali2.println(Password);
                                        System.out.println("contraseña guardada");
                                        salida.close();
                                        sali2.close();
                                        cerrando();
                                    }
                                    case 2 -> cerrando();

                                    default -> error();
                                }
                            } //fin switch decision case 1
                            case 2 -> cerrando();

                            default -> error();
                        } //fin switch decision
                    } //fin switch accion case 2
                    default -> error();
                } //fin switch accion

            } catch (Exception e) {
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("El valor introducido no es válido \n" + e.getMessage());//obtiene un mensaje que
            }                                                                                //muestra la excepción
        } while (!work);
    }
    public static void cerrando() {
        System.out.println("\nGracias por registrarse en SocialMediaGen!");
        System.out.println("Cerrando programa...");
        work = true;
    }
    public static void error() {
        System.out.println("acción no valida");
    }
}