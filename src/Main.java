public class Main {
    public static void main(String[] args) {
        // 1
        int numeroIf = 2;
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es Negativo");
        } else {
            System.out.println("El número es 0");
        }

        // 2
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Numero While: " + numeroWhile);
        }

        // 3
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("Numero DoWhile: " + numeroDoWhile);
        } while (numeroDoWhile < 0);

        // 4
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Numero For: " + numeroFor);
        }

        // 5
        String season = "spring";
        switch (season) {
            case "spring":
                System.out.println("Estación: Primavera");
                break;
            case "summer":
                System.out.println("Estación: Verano");
                break;
            case "autumn":
                System.out.println("Estación: Otoño");
                break;
            case "winter":
                System.out.println("Estación: Invierno");
                break;
            default:
                System.out.println("El valor indicado no es una estación.");
                break;
        }
    }
}