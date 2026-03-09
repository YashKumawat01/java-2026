package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ExcersiseOne {

    public static void main(String[] args) {

        /*  Write a program that fills array with n integers entered by user

        Suppose that user can enter at least 1 number and at most 20 numbers

        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter How Many Elements you want in Array ? (Maz : 20)");
        int n = sc.nextInt();

        if(n<=0 || n>20){
            System.out.println("Invalid Number, Please Try Again");
            n = sc.nextInt();
        }

        int[] numbers = new int[n];

        fillArrayofIntegers(numbers);
        printArrayofIntegers(numbers);

    }

    public static void fillArrayofIntegers(int[] numbers) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enters Elements :");
        for(int i=0; i<numbers.length; i++){
            numbers[i] = input.nextInt();
        }

    }

    public static  void printArrayofIntegers(int[] numbers){
        System.out.println("Here is Your Array :");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("\nHere is your sorted array :");
        System.out.println(Arrays.toString(numbers));
    }
}
