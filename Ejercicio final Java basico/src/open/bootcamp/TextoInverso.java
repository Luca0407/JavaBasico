package open.bootcamp;

import java.util.Scanner;

public class TextoInverso {
    public static void main(String[] args) {
        System.out.println("***Texto invertido*** \n");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe algo");
        String texto = entrada.nextLine();
        for (int i = texto.length()-1; i >= 0; i--) {
            System.out.println(texto.charAt(i));
        }
    }
}