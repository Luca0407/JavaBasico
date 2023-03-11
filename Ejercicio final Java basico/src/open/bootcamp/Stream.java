package open.bootcamp;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class Stream {
    public static void main(String[] args) {
        System.out.println("***Copiar de un fichero a otro*** \n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el fichero de origen: ");
        String fileIn = scanner.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String fileOut = scanner.nextLine();
        copiar(fileIn, fileOut);
    }

    private static void copiar(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();
            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
