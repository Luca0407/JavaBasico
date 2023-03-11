package com.openbootcamp;

/**
 * @author LucaSinS
 */

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hola mundo desde clase HelloWorld");
    }
}

class Salud2 {
    String saludo;
}

class Chau extends Salud2 {
    public Chau() {
        saludo = "hola mundo desde clase HelloWorld";
    }
}
