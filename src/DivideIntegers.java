import java.util.Scanner;

public class DivideIntegers {
    public static void main(String[] args) {
        int userNum;
        int divNum;
        Scanner scnr = new Scanner(System.in);
        userNum = scnr.nextInt();
        divNum =scnr.nextInt();
        userNum = userNum / divNum;
        System.out.print(userNum + " ");
        System.out.print(userNum / divNum + " ");
        System.out.print(userNum / divNum / divNum + "\n" );
    }
}
