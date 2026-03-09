package arrays;
import java.util.*;
public class First {

    public static void main(String[] args) {

//        Array Syntax

        int[] arr = {1,2,3,4};   // This is an array in which we declare and intialize both here ---- stored in Stack

        int[] arr1 = new int[10];  // Here we declare the array  and give size, but not initialize ----- Stored in Heap Memory
//        Starting address is Stored in Stack
    arr1[4]=54;
    arr1[8]=584;
//        Traversing in Array
        for (int  i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }


//        for - each loop

        for(int i : arr){
            System.out.println(i);
        }

    }
}
