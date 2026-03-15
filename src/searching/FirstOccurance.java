package searching;

public class FirstOccurance {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4, 5, 6};
        int target = 3;

        int index = firstOccurance(array, target);
        if (index != -1) {
            System.out.println("Element is found at index " + index);
        } else {
            System.out.println("Element is not found");
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
}
