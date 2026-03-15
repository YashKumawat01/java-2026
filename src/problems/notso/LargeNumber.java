package problems.notso;

import java.sql.SQLOutput;

public class LargeNumber {
    public static void main(String[] args) {


        int[] arr = {56, 211, 3, 65, 0, 1, 299};

        int result = largestNumber(arr);

        System.out.println("Largest Number From Array is : "+result);
    }

    public static int largestNumber(int[] arr){

        int temp = arr[0];

        for(int i=1; i<arr.length; i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }
}
