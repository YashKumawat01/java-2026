package problems.notso;

import java.util.Arrays;

public class SecondLargeNumber {

    public static void main(String[] args) {

        int[] arr = {65,89,87,54,12,23};

        System.out.println("Your Array is : " + Arrays.toString(args));

        int first = largestNumber(arr);
        int second = secondNumber(arr,first);

        System.out.println("First Largest Number is : "+ first);
        System.out.println("First Second Largest Number is : "+ second);
    }
    public static int largestNumber(int[] arr){
        int temp=arr[0];

        for(int i = 1; i<arr.length; i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }

    public static int secondNumber(int[] arr, int first){
int largest = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;

for (int num : arr){

    if(num>largest){
        second=largest;
        largest=num;
    } else if (num>second && num!=largest) {
        second=num;
        
    }
}
return second;
    }
}
