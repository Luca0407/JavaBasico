package com.openbootcamp;

public class CocheElectrico extends Coche {
    // atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;
    String motorElectrico;
    public CocheElectrico() {

    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico) {
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    public void acelerar2(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                "motorElectrico='" + motorElectrico + '\'' +
                '}';
    }
}
