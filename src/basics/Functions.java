package basics;

import java.util.Scanner;

public class Functions {

    public static void printName(String a) {
        System.out.println("Welcome "+ a);
    }

    public static void printSum(int a, int b) {
        int sum = a+b;
        System.out.println("Sum of the Numbers is "+sum);
    }

    public static void main(String[] args) {
//        System.out.println("Enetr Name :");
        Scanner sc = new Scanner(System.in);
//                String name = sc.next();
//        printName(name);
//        printName(name);
//        printName("Sanju");
//        printName("Vikram");
//        printName(name);

        System.out.println("Enter Two Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        printSum(num1,num2);


    }
}
