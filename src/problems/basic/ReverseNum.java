package problems.basic;
import java.util.*;
public class ReverseNum {

    public static int reverse(int num) {

        int rev = 0;

        while (num != 0) {

            int digit = num % 10;

            if (rev > Integer.MAX_VALUE / 10 ||
                    (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                throw new ArithmeticException("Overflow");
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                throw new ArithmeticException("Underflow");
            }

            rev = rev * 10 + digit;
            num /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {


        System.out.println("Enter Number :");

        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextInt()){
            System.out.println("Please Enter a Valid Number");
            sc.close();
            return;
        }
        int num = sc.nextInt();


        System.out.println("Reversed Number = "+reverse(num));
    }
}
