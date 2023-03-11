package com.openbootcamp;

public class Funciones {
    public static void main(String[] args) {
        holaMundo();
        holaMundo(4);
        holaMundo("Luca");
        // holaMundo();

        //holaMundo("Luca");
        //holaMundo("Luca2");

        //String hola = devolverHola();
        //System.out.println(hola);
    }
    protected static void holaMundo() {
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
    }

    public static void holaMundo(Integer num) {
        System.out.println("El número es: " + num);
    }

    public static void holaMundo(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static void holaMundo(String nombre, String apellido) {
        System.out.println("Hola " + nombre + "" + apellido);
    }

    private static String devolverHola() {
        return "Hola";
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }
}