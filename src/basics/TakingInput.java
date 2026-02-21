package basics;

import java.util.*;

public class TakingInput {

    public static void main(String[] args) {

//        Taking Input in Java

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your age : ");
        int age =sc.nextInt();

        if(age>=18){
            System.out.println("You are Eligiblle to vote");
        }
        else{
            System.out.println("You are not Eligible to Vote");
        }

        System.out.println("Enter the price of product : ");
        float product = sc.nextFloat();
        System.out.println("Price of Product is : "+product);


//        Now we take string input

        System.out.println("Input Your Name : ");
        String name = sc.next();
        System.out.println("Welcome "+name);
        sc.nextLine();

//        Now we take string (sentence) as input

        System.out.println("Enetr Your statement :");
        String statement = sc.nextLine();
        System.out.println("Your Statement is -> "+statement);


    }
}
