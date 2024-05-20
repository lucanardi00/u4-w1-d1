import java.util.Scanner;

public class Es3 {

    public static double perimetroRettangolo(double base, double altezza) {
        return 2 * (base + altezza);
    }

    public static int pariDispari(int numero) {
        if (numero % 2 == 0) {
            return 0; // Pari
        } else {
            return 1; // Dispari
        }
    }

    public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        return lato1 + lato2 + lato3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci base rettangolo: ");
        double baseRettangolo = scanner.nextDouble();

        System.out.print("Inserisci altezza rettangolo: ");
        double altezzaRettangolo = scanner.nextDouble();

        double perimetroRettangoloValore = perimetroRettangolo(baseRettangolo, altezzaRettangolo);
        System.out.println("Perimetro rettangolo: " + perimetroRettangoloValore);

        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();

        int pariDispariValore = pariDispari(numero);
        if (pariDispariValore == 0) {
            System.out.println(numero + " è pari");
        } else {
            System.out.println(numero + " è dispari");
        }

        System.out.print("Inserisci lato 1 triangolo: ");
        double lato1Triangolo = scanner.nextDouble();

        System.out.print("Inserisci lato 2 triangolo: ");
        double lato2Triangolo = scanner.nextDouble();

        System.out.print("Inserisci lato 3 triangolo: ");
        double lato3Triangolo = scanner.nextDouble();

        double perimetroTriangoloValore = perimetroTriangolo(lato1Triangolo, lato2Triangolo, lato3Triangolo);
        System.out.println("Perimetro triangolo: " + perimetroTriangoloValore);
    }
}
