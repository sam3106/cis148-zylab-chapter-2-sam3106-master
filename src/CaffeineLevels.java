import java.util.Scanner;

public class CaffeineLevels {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75.
        caffeineMg = scnr.nextDouble();
        caffeineMg = caffeineMg * .50;
        System.out.print("After 6 hours: ");
        System.out.printf("%.2f", caffeineMg);
        System.out.print(" mg\n");
        caffeineMg = caffeineMg * .50;
        System.out.print("After 12 hours: " );
        System.out.printf("%.2f", caffeineMg);
        System.out.print(" mg\n");
        caffeineMg = caffeineMg * .25;
        System.out.print("After 24 hours: ");
        System.out.printf("%.2f", caffeineMg);
        System.out.print(" mg\n");
    }
}
