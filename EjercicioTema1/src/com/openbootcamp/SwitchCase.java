package com.openbootcamp;

public class SwitchCase {
    public static void main(String[] args) {

        String wheather = "Cloudy";

        switch (wheather) {
            case "Cloudy":
                System.out.println("El tiempo esta nublado");
                break;

            case "Sunny":
                System.out.println("El tiempo esta soleado");
                break;

            default:
                System.out.println("No se ha podido determinar el tiempo");
                break;
        }

    }

    public static void tiempo() {
        String Tiempo = "Nublado";

        switch (Tiempo) {
            case "Nublado":
                System.out.println("El tiempo esta nublado");
                break;

            case "Soleado":
                System.out.println("El tiempo esta soleado");
                break;

            default:
                System.out.println("No se ha podido determinar el tiempo");
                break;
        }

    }
}