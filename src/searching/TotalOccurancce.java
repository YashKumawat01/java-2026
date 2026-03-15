package searching;

public class TotalOccurancce {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,4,5,6};
        int target = 3;


        int first = firstOccurance(array,target);

        int last = lastOccurance(array,target);


        if(first == -1){
            System.out.println("Target not found");
        } else {
            int count = last - first + 1;
            System.out.println("Target " + target + " occurred " + count + " times");
        }
    }

    public static int firstOccurance(int[] array, int target) {

        if (array == null || array.length == 0) {
            return -1;
        }

        int low = 0;
        int high = array.length - 1;
        int result = -1;


        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                result = mid;
                high = mid - 1;   // move left to find earlier occurrence
            }

            else if (array[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }


        return result;
    }
    public static int lastOccurance(int[] array, int target){

        int low = 0;
        int high = array.length-1;
        int result = -1;


        while(low<=high){
            int mid =  low + (high-low)/2;

            if(array[mid]==target){
                result = mid;
                low = mid + 1;
            } else if (array[mid]<target) {
                low = mid + 1;

            }
            else{
                high=mid-1;
            }
        }

        return result;
    }
}
