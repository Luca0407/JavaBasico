package com.openbootcamp;

public class CocheServiceClassicImpl implements CocheService{

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche");
    }
}

class CreateAndDestroy {
    String construir;
    String destruir;
}

class DestroyAndCreate extends CreateAndDestroy {
    public DestroyAndCreate() {
        construir = "Creando coche clasico";
        destruir = "Destruyendo coche";
    }
}
