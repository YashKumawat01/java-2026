package basics;

import java.util.*;
import java.util.Scanner;

public class MiniProject {

    public static void main(String[] args) {

        System.out.println("Welcome To Number Guessing Game");
        System.out.println("If you Want to quit game enter '-1' ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int randomNumber =(int)(Math.random()*100);


        while(true) {
            if (num == randomNumber) {
                System.out.println("Congratulation you Win The Game");
                return;
            } else if (num > randomNumber) {
                System.out.println("The number is less than " + num);
                num = sc.nextInt();
                if (num == -1) {
                    System.out.println("The Random Number is " + randomNumber);
                    return;
                }

            } else if (num < randomNumber) {
                System.out.println("The number is higher than " + num);
                num = sc.nextInt();
                if (num == -1) {
                    System.out.println("The Random Number is " + randomNumber);
                    return;
                }
            }
        }



    }
}



/*   This is the Edge Case Solution of the Game


package basics;

import java.util.Scanner;

public class MiniProject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 100) + 1;
        int attempts = 0;

        System.out.println("Guess the number (1-100). Enter -1 to quit.");

        while (true) {

            System.out.print("Enter guess: ");
            int num = sc.nextInt();

            // quit check (single place)
            if (num == -1) {
                System.out.println("Game quit. Number was: " + randomNumber);
                break;
            }

            attempts++;

            if (num == randomNumber) {
                System.out.println("Correct! Attempts: " + attempts);
                break;
            } else if (num > randomNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }
    }
}



*/