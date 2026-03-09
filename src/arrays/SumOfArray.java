package arrays;

public class SumOfArray {

    public static int sumArray(int[] arr){

        if(arr == null || arr.length == 0){
            System.out.println("Array is Empty");
            return 0;
        }

        int sum = 0;

        for(int num : arr){
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {

//        int[] arr = {10,20,30,40,50};
        int[] arr = null;

        int result = sumArray(arr);

        System.out.println("Sum of Array is : " + result);
    }
}