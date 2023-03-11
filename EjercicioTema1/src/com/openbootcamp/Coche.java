package com.openbootcamp;

public class Coche {

    // atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    //Listas
    String name = "nombre de coche";


    // constructores
    public Coche() {}

    public Coche(String name) {
        this.name = name;
    }

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    // comportamiento
    public void acelerar(Integer cantidad) {
        if(cantidad > 0 && cantidad <= 120)
            this.velocidad += cantidad;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", name='" + name + '\'' +
                '}';
    }
}
