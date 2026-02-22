package problems.number_problems;

import java.util.*;
import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {

//        Print Factorial of Number

        System.out.println("Enetr The Number : ");

        Scanner sc = new Scanner(System.in);

        long num = sc.nextInt();

        if(num<0){
            System.out.println("Sorry No Negative Number Allowed :(");
            return;
        }
//
//        int fact = 1;
//
//        for (int i=1;i<=num;i++){
//            fact=i*fact;
//        }


        // Edge case safe solution using BigInteger
        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }


        System.out.println("Factorial of "+num+" is "+fact);
    }
}
