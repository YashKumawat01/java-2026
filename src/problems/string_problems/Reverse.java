package problems.string_problems;

import java.util.*;

public class Reverse {

//    :::::::::::::::::::::::::::::::  Reverse the String :::::::::::::::::::::::::::::::::::

    public static void main(String[] args) {


        System.out.println("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
//
        int length = str.length();
        System.out.println("Length of String : " + length);

        int left = 0;
        int right = arr.length - 1;

        if (str == null || str.length() <= 1) {
            System.out.println("Invalid Input for Reversing :(");
            return;
        }

        while (left<right){
            char temp = arr[left];
            arr[left]= arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
        System.out.println("\nOriginal String is : " + str);
        System.out.println("\nReversed String is : " + new String(arr));

    }

}
