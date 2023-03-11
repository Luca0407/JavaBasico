package com.openbootcamp;

public class ByeWorld {
    public static void main(String[] args) {
        System.out.println("adios desde clase ByeWorld");
    }
}

class Saludo {
    String despedida;
}

class Chao extends Saludo {
    public Chao() {
        despedida = "adios desde clase ByeWorld";
    }
}