package problems.basic;

import java.util.*;

public class Swapping {

    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping :");
        System.out.println("Num 1 :" + num1);
        System.out.println("Num 2 :" + num2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number :");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a Integer Number");
            sc.close();
            return;
        }
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number :");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a Integer Number");
            sc.close();
            return;
        }
        int num2 = sc.nextInt();

        System.out.println("Before Swapping :");
        System.out.println("Num 1 = " + num1);
        System.out.println("Num 2 = " + num2);

        swap(num1, num2);

        sc.close();

    }
}
