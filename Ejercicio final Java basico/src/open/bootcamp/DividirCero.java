package open.bootcamp;


import java.util.Scanner;

public class DividirCero {
    private static int Dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }
    public static void main(String[] args) {
        System.out.println("***Division*** \n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Indica los numeros que quieres dividir");
        System.out.print("Numero 1: ");
        int a = scan.nextInt();

        System.out.print("Numero 2: ");
        int b = scan.nextInt();

        try {
            System.out.println("Resultado: " + Dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

    }
}
