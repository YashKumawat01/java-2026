package problems.notso;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int [] arr = {32,45,56,89};
        System.out.println("Your array is : " + Arrays.toString(arr));

        int result = sumArray(arr);

        System.out.println("Sum of Array is : "+ result);
    }

    public static int sumArray(int[] arr){
        int temp=0;

        for(int i=0; i<arr.length;i++){

            temp+=arr[i];
        }
        return temp;
    }
}
