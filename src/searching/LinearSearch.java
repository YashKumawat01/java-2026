package searching;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

//        Linear Search - Iterate through  a colletion of element at a time

//        rintime complexity id = O(n)

//        Disadvantage :  Slow for large data sets

//        Advantage  :  Fast for small data sets
//                      Does not need sort
//                      Useful for Data structures that not randomly access(like Linked List)


        int[] arr = {98,56,2,0,54};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element finding in array");
        int value = sc.nextInt();

        int index = linearSearch(arr,value);

        if(index != -1){
            System.out.println("Element is Found at index : " + index);
        }
        else {
            System.out.println("Element is not found");
        }
    }

    private static int linearSearch(int[] arr, int value) {

        for(int i = 0; i< arr.length; i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }
}
