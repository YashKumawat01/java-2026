package searching;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {


//        Binary Search - Search algorithm that finds the position of target
//                         value within a sorted array.
//                          Half of array is eliminated during each step.

        int[] array = new int[100];
        int target = 420;

        for(int i=0; i< array.length; i++){
            array[i]=i;
        }

//        ************************************************
//        Built in method
//        int index = Arrays.binarySearch(array,target);
//        ************************************************

        int index = binarySearch(array,target);

        if(index != -1){
            System.out.println("Element is found at index "+index);
        }
        else {
            System.out.println("Element is not found");
        }

    }

    public static int binarySearch(int[] array, int target){

        if(array == null || array.length == 0){
            return -1;
        }

        int low = 0;
        int high = array.length - 1;

        if(target < array[low] || target > array[high]){
            return -1;
        }

        while(low <= high){

            int mid = low + (high - low) / 2;
            int midValue = array[mid];

            if(midValue < target){
                low = mid + 1;
            }
            else if(midValue > target){
                high = mid - 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
