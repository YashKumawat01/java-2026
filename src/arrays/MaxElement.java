package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array must contain at least 1 element");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your Array is " + Arrays.toString(arr));

        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum Element From Array is: " + max);

        sc.close();
    }
}