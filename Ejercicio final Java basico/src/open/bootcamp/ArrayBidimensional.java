package open.bootcamp;

public class ArrayBidimensional {
    public static void main(String[] args) {
        System.out.println("***Array bidimensional de enteros*** \n");
        Integer[][] numeros = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9}
            };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Fila: " + (i + 1) + " | Columna: " + (j + 1) +
                        "\nEl valor es: " + numeros[i][j] + "\n");
            }
        }
    }
}
