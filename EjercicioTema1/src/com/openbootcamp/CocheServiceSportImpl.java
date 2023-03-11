package com.openbootcamp;

public class CocheServiceSportImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        System.out.println("Creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche");
    }
}

class CrearyDestruir {
    String construir;
    String destruir;
}

class DestruiryCrear extends CrearyDestruir {
    public DestruiryCrear() {
        construir = "Creando coche de carreras";
        destruir = "Destruyendo coche";
    }
}
