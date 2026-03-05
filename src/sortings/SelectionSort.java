package sortings;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {56,78,98,12,32,1};
//        int[] arr = {1,2,3,4,5,6,8,7};
        int n = arr.length;

        System.out.println("Original Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        int count=0;

        for(int i = 0; i < n - 1; i++){

            int minIndex = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                    count++;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("\nNumber of Swaps in sorting : "+count);
        System.out.println("\nSorted Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}