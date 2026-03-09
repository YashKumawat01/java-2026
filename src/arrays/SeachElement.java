package arrays;

import java.util.Scanner;

public class SeachElement {


    public static void main(String[] args) {
        int[] arr = {32,54,98,12,54,0};


        System.out.println("Enter The Element for search from array");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
boolean isPresent = false;
        for(int i : arr){
            if(i==num){
                System.out.println("Element is present in array  ");
                isPresent=true;
                break;
            }
        }

        if(!isPresent){
            System.out.println("Array is Not Present in Array");
        }
        sc.close();
    }

}
