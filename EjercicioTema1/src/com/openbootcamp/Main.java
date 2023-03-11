package com.openbootcamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Chao adios = new Chao();
        Chau hola = new Chau();
        Resultado resultado = new Resultado();
        DestruiryCrear spanish = new DestruiryCrear();
        DestroyAndCreate english = new DestroyAndCreate();

        System.out.println("***HelloWorld***");
        System.out.println(hola.saludo);

        System.out.println("***ByeWorld***");
        System.out.println(adios.despedida);

        System.out.println("***Operadores***");
        System.out.println(resultado.resultado1); // 1 + 2
        System.out.println(resultado.resultado2); // 2 - 1
        System.out.println(resultado.resultado3); // 2 * 2
        System.out.println(resultado.resultado4); // 2 / 1

        System.out.println("***Funciones***");
        Funciones.holaMundo();
        Funciones.holaMundo(4);
        Funciones.holaMundo("Nombre");

        System.out.println("***IfElse***");
        Numeros.Calculo();

        System.out.println("***ForLoop***");
        ForLoop.forLoop();

        System.out.println("***WhileLoop***");
        WhileLoop.whileLoop();

        System.out.println("***SwitchCase***");
        SwitchCase.tiempo();

        System.out.println("***CocheMain***");
        CocheMain.TeslaCar();

        System.out.println("***PolimorfismoMain***");
        PolimorfismoMain.instanciaDe();

        System.out.println("***CocheServiceSportImpl***");
        System.out.println(spanish.construir);
        System.out.println(spanish.destruir);

        System.out.println("***CocheServiceClassicImpl***");
        System.out.println(english.construir);
        System.out.println(english.destruir);

        System.out.println("***ListMain***");
        ListMain.Listas();

        System.out.println("***MapMain***");
        MapMain.Mappa();
    }
}