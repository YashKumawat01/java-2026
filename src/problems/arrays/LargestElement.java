package problems.arrays;
import java.util.*;

public class LargestElement {

    public static void main(String[] args) {

//        ::::::::::::: Largets Element from array :::::::::::::

        System.out.println("Enter 5 elements in Arrays");

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
//
        for(int i=0;i<5;i++){
             arr[i]= sc.nextInt();
        }


        int largest = arr[0];

        for(int i=1; i<arr.length;i++){
            if(arr[i]>largest){
                largest =arr[i];
            }
        }

        System.out.println("Largest Element from array is : "+largest);


//        Time Complexity is O(n)

    }
}
