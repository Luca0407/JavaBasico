package com.sless;
import java.util.Scanner;

/**
 * @author Luca Elizondo
 */

public class CalculadoraImpuestos {
    static boolean validado = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio;
        double IVA;

                System.out.println("Introduzca un monto a calcular (ARS)");
                try {
                    precio = scanner.nextDouble();
                    validado = true;
                    IVA = precio * 0.75 + precio;
                    System.out.println("Su monto con impuestos incluidos es aproximádamente de: " + IVA);
                    validado = true;
                } catch (Exception e) {
                    System.out.println("el valor introducido no es válido...");
                }
        }
    }
