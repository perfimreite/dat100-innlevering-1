import java.util.Scanner;

public class O2 {
    static void giKarakter(int poengsum) {
        if      (poengsum <= 39) System.out.println("F");
        else if (poengsum <= 49) System.out.println("E");
        else if (poengsum <= 59) System.out.println("D");
        else if (poengsum <= 79) System.out.println("C");
        else if (poengsum <= 89) System.out.println("B");
        else                     System.out.println("A");
    }

    public static void main(String[] args) {
        /* Oppgåve a */
        Scanner scanner = new Scanner(System.in);
        int poengsum;

        System.out.print("Poengsum: ");
        poengsum = scanner.nextInt();
        if (poengsum < 0 || poengsum > 100) System.out.println("Ugyldig poengsum: " + poengsum);
        else giKarakter(poengsum);
       
        /* Oppgåve b */
        for (int i = 0; i < 10; i++) {
            System.out.print("Poengsum: ");
            poengsum = scanner.nextInt();
            if (poengsum < 0 || poengsum > 100) System.out.println("Ugyldig poengsum: " + poengsum);
            else giKarakter(poengsum);
        }

        /* Oppgåve c */
        do {
            System.out.print("Poengsum: ");
            poengsum = scanner.nextInt();
        } while (poengsum < 0 || poengsum > 100);

        giKarakter(poengsum);
        
        scanner.close();
    }
}
