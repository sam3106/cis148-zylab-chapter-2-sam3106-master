import java.util.Scanner;

public class CaloriesBurned {
    public static void main(String[] args) {
        int age;
        double weight;
        double heartRate;
        double time;
        double wCalories;
        double mCalories;

        Scanner scnr = new Scanner(System.in);
        age = scnr.nextInt();
        weight = scnr.nextDouble();
        heartRate = scnr.nextDouble();
        time = scnr.nextDouble();

        wCalories =  ((age * 0.074) - (weight * 0.05741) + (heartRate * 0.4472) - 20.4022 )* time / 4.184;
        mCalories =  ((age * 0.2017) + (weight * 0.09036) + (heartRate * 0.6309) - 55.0969 )  * time / 4.184;


        System.out.print("Women: ");
        System.out.printf("%.2f", wCalories);
        System.out.print(" calories\n");
        System.out.print("Men: ");
        System.out.printf("%.2f", mCalories);
        System.out.print(" calories\n");
        /* Type your code here. */
    }
}
