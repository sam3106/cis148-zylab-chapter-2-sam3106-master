import java.util.Scanner;

public class DrivingCosts {
    public static void main(String[] args) {

        /* Type your code here. */
        double totalCost;
        double miles;
        double answer;

        Scanner scnr = new Scanner(System.in);
        totalCost = scnr.nextDouble();
        miles = scnr.nextDouble();
        answer = miles / (totalCost/20);
        System.out.printf("%.2f", answer);
        System.out.print(" ");
        answer = miles / (totalCost/75);
        System.out.printf("%.2f", answer);
        System.out.print(" ");
        answer = miles / (totalCost/500);
        System.out.printf("%.2f", answer);
        System.out.print("\n");

    }
}
