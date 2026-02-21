package basics;

public class Operators {
    public static void main(String[] args) {

        double a, b;
        a = 4;
        b = 5;

//    Arithmetic Operator

        double sum = a + b;
        double diff = a - b;
        double multiply = a * b;
        double divide = a / b;
        double modulo = a % b;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modulo);

//        *************************************************************************

//        Assignment Operators

//        *************************************************************************

        int n = 10;
        System.out.println("Now Value of n is : "+n);


        // n = n + 5
        n += 5;
        System.out.println("After += : " + n);
        System.out.println("Now Value of n is : "+n);

        // n = n * 2
        n *= 2;
        System.out.println("After *= : " + n);
        System.out.println("Now Value of n is : "+n);


        // n = n - 5
        n -= 5;
        System.out.println("After -= : " + n);
        System.out.println("Now Value of n is : "+n);


        // n = n / 2
        n /= 2;
        System.out.println("After /= : " + n);
        System.out.println("Now Value of n is : "+n);


        // n = n % 3
        n %= 3;
        System.out.println("After %= : " + n);
        System.out.println("Now Value of n is : "+n);

//        *************************************************************************

//      Comparison Operators
//        *************************************************************************

//      a==b
//      a != b
//      a > b
//      a < b
//      a <= b
//      a >= b
    }
}
