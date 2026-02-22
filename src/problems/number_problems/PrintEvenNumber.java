package problems.number_problems;

import java.util.Scanner;

public class PrintEvenNumber {

    public static void main(String[] args) {

//        Print all Even the numbers between 0 to N

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("Even numbers from 0 to " + num);

        for (int i = 0; i <= num; i += 2) {
            System.out.println(i);
        }

    }

}
