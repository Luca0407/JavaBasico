package com.openbootcamp;

public class InterfacesMain {
    public static void main(String[] args) {
        CocheService service = new CocheServiceSportImpl();

        Coche coche = service.crearCocheDemo();

    }
}
