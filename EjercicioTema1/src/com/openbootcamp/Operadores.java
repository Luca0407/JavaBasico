package com.openbootcamp;

public class Operadores {
    public static void main(String[] args) {
        /*
        ~Operadores~


        Aritméticos
        +
        -
        *
        /
         */


        /*
        Lógicos, relación, comparación, boleanos
        <
        <=
        >
        >=
        ==
        !=
        && (and)
        || (or)
        !
         */

        /*
        Asignación
        =
        +=
        -=
        /=
        *=
        %=
         */

        /*
        Incremento y decremento
        ++
        --
         */

        /*
        Concatenación (unir strings con otros strings o tipos de datos)
        +
         */
    }
}

class Valores {
    int num1 = 1;
    int num2 = 2;
    int resultado1;
    int resultado2;
    int resultado3;
    int resultado4;
}

class Resultado extends Valores {
    public Resultado() {
        resultado1 = num1 + num2;
        resultado2 = num2 - num1;
        resultado3 = num2 * num2;
        resultado4 = num2 / num1;
    }
}