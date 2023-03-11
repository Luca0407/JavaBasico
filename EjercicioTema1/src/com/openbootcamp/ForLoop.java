package com.openbootcamp;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {

            if(i == 6)
                continue;

            System.out.println(i + " Hola Mundo");
        }
    }

    public static void forLoop() {
        for (int j = 0; j <= 10; j++) {

            if(j == 6)
                continue;

            System.out.println(j + " Hola Mundo");
        }
    }
}
