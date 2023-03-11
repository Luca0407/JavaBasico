package com.openbootcamp;

public class WhileLoop {
    public static void main(String[] args) {

        int count = 0;
        while(count < 10) {
            count++; //condición

            if(count == 6)
                break; //rompe el flujo de ejecución
            //continue; //salta el valor 6 y continúa a la siguiente iteración

            System.out.println("Hola mundo" + count);
        }
        System.out.println("fin");
    }

    public static void whileLoop() {
        int count = 0;
        while(count < 10) {
            count++;

            if(count == 6)
                break;
                //continue;

            System.out.println("Hola mundo" + count);
        }
        System.out.println("fin");
    }
}
