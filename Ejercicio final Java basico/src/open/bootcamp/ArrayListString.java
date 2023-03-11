package open.bootcamp;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListString {
    public static void main(String[] args) {
        System.out.println("***ArrayList de String*** \n");

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Paco");
        lista.add("Ana");
        lista.add("Jesus");
        lista.add("Lucia");

        LinkedList<String> listaEnlazada = new LinkedList<>();

        for (int i = 0; i < lista.size(); i++) {
            listaEnlazada.add(i, lista.get(i));
        }

        System.out.println("Elementos del ArrayList");
        for (String elementos : lista) {
            System.out.print(elementos + " ");
        }

        System.out.println("\n\nElementos de la LinkedList");
        for (String elementos : listaEnlazada) {
            System.out.print(elementos + " ");
        }
    }
}
