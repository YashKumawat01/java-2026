package searching;

public class LastOccurance {

    public static void main(String[] args) {

        int[] array = {1,2,3,3,3,4,5,6};
        int target = 4;

        int index = lastOccurance(array,target);

        if(index != -1){
            System.out.println("Element Last Occur on index : "+ index);
        }
        else{
            System.out.println("Element not Found");
        }

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
