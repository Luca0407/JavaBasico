package com.wipper;

public class Concatenados {
    public static void main(String[] args) {

        String str1 = "Resuelto";
        String str2 = " ejercicio ";
        String str3 = "tema 3";
        String str4 = str1.concat(str2);
        String str5 = str4.concat(str3);

        int i = 0;

        do {
            System.out.println(str5);
            i++;
        } while (0 == i);

    }
}

