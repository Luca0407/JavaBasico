package open.bootcamp;

public class ArrayUnidimensional {
    public static void main(String[] args) {
        System.out.println("***Array unidimensional de strings*** \n");
        String[] texto = new String[]
                { "Texto 1 ", "Texto 2 ", "Texto 3"};
        for (String textos : texto) {
            System.out.print(textos);
        }
    }
}
