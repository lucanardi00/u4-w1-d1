import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci prima stringa: ");
        String stringa1 = scanner.nextLine();

        System.out.print("Inserisci seconda stringa: ");
        String stringa2 = scanner.nextLine();

        System.out.print("Inserisci terza stringa: ");
        String stringa3 = scanner.nextLine();

        String concatenataOrdine = stringa1 + stringa2 + stringa3;
        System.out.println("Concatenazione in ordine: " + concatenataOrdine);

        String concatenataInverso = stringa3 + stringa2 + stringa1;
        System.out.println("Concatenazione in ordine inverso: " + concatenataInverso);
    }
}
