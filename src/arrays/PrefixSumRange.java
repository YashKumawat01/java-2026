package arrays;

import java.util.Arrays;

public class PrefixSumRange {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9};

        int[] prefix = buildPrefix(arr);

        int L = 1;
        int R = 3;

        int result = rangeSum(prefix, L, R);

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Prefix : " + Arrays.toString(prefix));
        System.out.println("Sum from index " + L + " to " + R + " = " + result);
    }

    public static int[] buildPrefix(int[] arr){

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        return prefix;
    }

    public static int rangeSum(int[] prefix, int L, int R){

        if(L == 0){
            return prefix[R];
        }

        return prefix[R] - prefix[L-1];
    }
}
