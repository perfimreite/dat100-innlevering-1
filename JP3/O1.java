import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bruttoinntekt: ");
        int bruttoinntekt = scanner.nextInt();

        double trinnskatt = 0;

        if (bruttoinntekt >   217_400) trinnskatt += (      306_050 -   217_401) * 0.017;
        if (bruttoinntekt >   306_050) trinnskatt += (      697_150 -   306_051) * 0.040;
        if (bruttoinntekt >   697_150) trinnskatt += (      942_400 -   697_151) * 0.137;
        if (bruttoinntekt >   942_400) trinnskatt += (    1_410_570 -   942_401) * 0.167;
        if (bruttoinntekt > 1_410_750) trinnskatt += (bruttoinntekt - 1_410_750) * 0.177;

        System.out.println("Trinnskatt: " + trinnskatt + "kroner");

        scanner.close();
    }
}
