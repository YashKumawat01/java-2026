package problems.basic;
import java.util.*;

public class LargestNumber {

    public static int largestValue(int num1, int num2, int num3){

        int max = num1;
        if(max<num2){
            max=num2;
        }
        if(max<num3){
            max=num3;
        }
        return max;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        if(!sc.hasNextInt()){
            System.out.println("Input a Valid Integer Value ");
            sc.close();
            return;
        }
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number :");
        if(!sc.hasNextInt()){
            System.out.println("Input a Valid Integer Value ");
            sc.close();
            return;
        }
        int num2 = sc.nextInt();

        System.out.println("Enter Third Number :");
        if(!sc.hasNextInt()){
            System.out.println("Input a Valid Integer Value ");
            sc.close();
            return;
        }
        int num3 = sc.nextInt();


        System.out.println("Largest Number is: " + largestValue(num1, num2, num3));
        sc.close();

    }
}
