package arrays;

import java.util.Arrays;

public class SearchInArray {

    public static void main(String[] args) {

//        Binary Search Array
        int[] number = {32,65,87,89,45,12,59};

        Arrays.sort(number);
        System.out.println("Sorted : "+ Arrays.toString(number));
        System.out.println(Arrays.binarySearch(number,89));
        System.out.println(Arrays.binarySearch(number,90));
        System.out.println(Arrays.binarySearch(number,20));

    }
}
