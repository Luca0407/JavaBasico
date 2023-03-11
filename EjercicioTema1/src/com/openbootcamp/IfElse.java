package com.openbootcamp;

public class IfElse {
    public static void main(String[] args) {
        boolean check = 5 < 10;

        int numero1 = 50;
        int numero2 = 10;
        int numero3 = 20;
        int numero4 = 1000;

        if(numero1 < numero2 && numero2 < numero3) {
            System.out.println("verdadero");
        } else if(numero3 < numero4) {
            System.out.println("else if");
        }
        System.out.println("fin");
    }
}

class Numeros {
    public static void Calculo() {
        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        int number4 = 1000;

        if (number1 < number2 && number2 < number3) {
            System.out.println("verdadero");
        } else if (number3 < number4) {
            System.out.println("else if");
        }
        System.out.println("fin");
    }
}