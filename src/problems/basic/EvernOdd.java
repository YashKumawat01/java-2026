package problems.basic;

import java.util.Scanner;

public class EvernOdd {

    public static boolean isEven(int num) {
        return (num & 1) == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            sc.close();
            return;
        }

        int num = sc.nextInt();

        // If you want to reject negatives:
        if (num < 0) {
            System.out.println("Negative numbers are not allowed.");
            sc.close();
            return;
        }

        if (isEven(num)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        sc.close();
    }
}