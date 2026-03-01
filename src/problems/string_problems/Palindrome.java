package problems.string_problems;

import java.util.*;
import java.util.Scanner;

public class Palindrome {

//   :::::::::::::::::::: Check the String is Palindrome :::::::::::::::::::::::

    public static void main(String[] args) {


        System.out.print("Enter the String : ");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if (str == null || str.trim().isEmpty()) {
            System.out.println("Please Enter a valid String !");
            return;
        }

        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");


        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("No the String is not Palindrome :(");
                return;
            }
            left++;
            right--;
        }

        System.out.println("String is Palindrome :)");
    }
}
