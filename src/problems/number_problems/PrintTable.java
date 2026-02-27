package problems.number_problems;

import java.util.*;

public class PrintTable {


    public static void generateTable(int n){
        if(n<=0){
            System.out.println("Invalid Input");
            return;
        }
        for(int i=1;i<=10;i++){
            int table = i*n;
            System.out.println(n+" x "+i+" = "+table);

        }

    }
    public static void main(String[] args) {

        System.out.println("Enter the Number whose table you  want to print");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        generateTable(num);

    }
}
