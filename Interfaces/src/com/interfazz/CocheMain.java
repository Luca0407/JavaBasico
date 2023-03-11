package com.interfazz;

public class CocheMain {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl(); //creado objeto

    public static void main(String[] args) {
        System.out.println(cocheCRUD); //imprimido objeto como toString



        String cadena = "Mensaje de texto";
        int largo = (cadena.length());


        for (int i = cadena.length()-1; i >= 0; i--) {
            System.out.println(cadena.charAt(i));
        }

    }
}
