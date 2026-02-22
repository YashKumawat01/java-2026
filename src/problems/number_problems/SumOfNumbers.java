package problems.number_problems;

import java.util.Scanner;

public class SumOfNumbers {

//    Print Sum of Number from 1 -> N

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");

        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("No Negative Input Allowed :(");
            return;
        }
        int temp = 0;
        for (int i = 0; i <= num; i++) {
            temp += i;
        }
        System.out.println("Sum of Numbers from 0 to " + num);
        System.out.println(temp);


            /*   Edge Case Solution of Thre Problem

            if (num < 0) {
                System.out.println("Invalid Input");
                return;
            }

            long sum = (long) num * (num + 1) / 2;

            System.out.println("Sum from 1 to " + num + " = " + sum);
            */
    }
}
