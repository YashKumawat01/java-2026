package arrays;

import java.io.LineNumberReader;
import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] arr = {56, 879, 9832, 54, 0, 5};
        System.out.println("\nOriginal Array is : " + Arrays.toString(arr));


//        Reverse Print the array

//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }

        // Above One is Basic method for print reverse array

        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i]= arr[arr.length-1-i];
        }
        System.out.println("Reversed Array is : "+Arrays.toString(reversed));

    }
}
