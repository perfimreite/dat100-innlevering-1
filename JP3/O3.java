import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("n: "); 
            n = scanner.nextInt();
        } while (n < 1);
        
        int fakultet = 1;
        for (int i = 2; i <= n; i++) fakultet *= i;

        System.out.println("Fakultet av " + n + " er: " + fakultet);

        scanner.close();
    }
}
