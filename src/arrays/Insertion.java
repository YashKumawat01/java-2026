package arrays;
import java.util.*;
public class Insertion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before insertion:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter element to insert:");
        int element = sc.nextInt();

        System.out.println("Enter position:");
        int position = sc.nextInt();

        if(position < 0 || position > n){
            System.out.println("Invalid Position");
            return;
        }

        for(int i = n; i > position; i--){
            arr[i] = arr[i-1];
        }

        arr[position] = element;
        n++;

        System.out.println("Array after insertion:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
