package problems.number_problems;

import java.util.Scanner;



//    In this we Reverse the Number input by User

    public class ReverseNumber {

        public static int reverse(int n) {

            long rev = 0;   // to detect overflow
            int num = n;

            while (num != 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;

                if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                    return 0;
                }

                num /= 10;
            }

            return (int) rev;
        }

        public static void main(String[] args) {
            System.out.println(reverse(123));        // 321
            System.out.println(reverse(-123));       // -321
            System.out.println(reverse(120));        // 21
            System.out.println(reverse(0));          // 0
            System.out.println(reverse(1534236469)); // overflow → 0
        }
    }

