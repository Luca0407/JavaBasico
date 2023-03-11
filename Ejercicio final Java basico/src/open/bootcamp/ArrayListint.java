package open.bootcamp;

import java.util.ArrayList;

public class ArrayListint {
    public static void main(String[] args) {
        System.out.println("***ArrayList de int*** \n");

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(i);
            for (int j = 0; j < lista.size(); j++) {

                if (lista.get(j) % 2 == 0)
                    lista.remove(j);
            }
        }
        System.out.println(lista);
    }
}
