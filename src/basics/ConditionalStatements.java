package basics;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {

//        Conditional Statements

        boolean isSunUp = true;

        if(isSunUp==true){
            System.out.println("Day");
        }
        else{
            System.out.println("Night");
        }


//        PROBLEM 2

        Scanner sc = new Scanner(System.in);
        System.out.println("Price of Pen is 15 Price of Notebook is 60");
        System.out.println("Enter How Much Cash You Have ");
        int cash = sc.nextInt();

        if(cash<15){
            System.out.println("Cannot buy anything");
            System.out.println("Get More Cash");
        } else if (cash>=15 && cash<50) {
            System.out.println("Can get Only one thing");
        }
        else{
            System.out.println("can Get Both");
        }

    }
}
