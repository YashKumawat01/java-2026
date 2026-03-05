package sortings;

public class BubbleSort {

    public static void main(String[] args) {

//        int[] arr = {65,78,12,0,54,23,1};
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        System.out.println("Present Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }

        int swapCount = 0;

        for(int i = 0; i < n - 1; i++){

            boolean isSwap = false;

            for(int j = 0; j < n - i - 1; j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapCount++;
                    isSwap = true;
                }
            }

            if(!isSwap){
                System.out.println("\nArray sorted early. Stopping algorithm.");
                break;
            }
        }

        System.out.println("\nNumber of swaps: " + swapCount);

        System.out.println("Sorted Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}