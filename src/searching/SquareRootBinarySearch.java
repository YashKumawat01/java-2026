package searching;

public class SquareRootBinarySearch {

    public static int sqrt(int x) {

        int low = 0;
        int high = x;
        int result = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }

            else if (square < x) {
                result = mid;
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int x = 12;

        int ans = sqrt(x);

        System.out.println("Square root (floor value): " + ans);
    }
}
