public class Main {
    public static void main(String[] args) {

        int numeroIf = 1;
        int numeroWhile = -1;
        int numeroDoWhile = 3;
        int numeroFor;
        String estacion = "Verano";

        System.out.println("numeroIf");
        if (numeroIf > 0) {
            System.out.println("es positivo");
        } else if (numeroIf < 0) {
            System.out.println("es negativo");
        } else {
            System.out.println("es cero");
        }

        System.out.println("numeroWhile");
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("numeroDoWhile");
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 4);

        System.out.println("numeroFor");
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("Estación");
        switch (estacion) {
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
        }
    }
}