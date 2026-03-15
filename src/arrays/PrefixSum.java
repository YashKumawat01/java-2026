package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrefixSum {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9};

        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));

        calculatePrefixSum(arr);

        System.out.println("Here is Prefix Sum Array is : ");
        System.out.println(Arrays.toString(calculatePrefixSum(arr)));
    }

    public static int[] calculatePrefixSum(int[] arr){
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];

        for(int i=1; i< arr.length; i++){

            prefixSum[i] =  prefixSum[i-1]+arr[i];
        }

        return prefixSum;
    }
}
