import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bruttoinntekt: ");
        int bruttointekt = scanner.nextInt();
        scanner.close();

        double trinnskatt;

        if (bruttointekt <= 217_400)        trinnskatt =    0;
        else if (bruttointekt <= 306_050)   trinnskatt =  1.7;
        else if (bruttointekt <= 697_150)   trinnskatt =  4.0;
        else if (bruttointekt <= 942_400)   trinnskatt = 13.7;
        else if (bruttointekt <= 1_410_750) trinnskatt = 16.7;
        else                                trinnskatt = 17.7;

        System.out.println("Trinnskatt: " + trinnskatt + "%");
    }
}
