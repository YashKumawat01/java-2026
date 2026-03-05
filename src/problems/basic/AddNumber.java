package problems.basic;

import java.util.Scanner;

public class AddNumber {

    /* use BigDecimal in place of double if we use for money problems */

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }
        double num2 = sc.nextDouble();

        System.out.println("Sum: " + sum(num1, num2));

        sc.close();
    }
}