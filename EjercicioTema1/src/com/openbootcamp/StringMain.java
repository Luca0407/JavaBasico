package com.openbootcamp;



public class StringMain {
    public static void main(String[] args) {

        //la clase String

    /*
        length()
        startsWith("")
        endsWith("")
        indexOf("")
        subString(1, 5)
        trim()
        equals()
        compareTo()
     */

        String mensaje = "  Hola Mundo  ";
        System.out.println(mensaje.length());
        String mensajeMay = mensaje.toUpperCase();
        System.out.println(mensajeMay);
        System.out.println(mensajeMay.trim());
        mensajeMay = mensajeMay.trim();

        String otro = "hola mundo";
        if(mensajeMay.equalsIgnoreCase(otro)) {
            System.out.println("Verdadero!!");
        }

    }
}
