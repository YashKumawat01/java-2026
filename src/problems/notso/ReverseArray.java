package problems.notso;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,89,78,89,65,32,4};
        int n = arr.length;
        System.out.println("Your Original Array is : " + Arrays.toString(arr));


        reverseArray(arr);
//        System.out.println("Your reversed array is :" + reverseArray(arr));
        System.out.println("Your Reversed Array is : " + Arrays.toString(arr));

    }

    public static void reverseArray(int[] arr){

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
