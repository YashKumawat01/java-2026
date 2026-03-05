package problems.basic;
import  java.util.*;
public class Table {

    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        if(!sc.hasNextInt()){
            System.out.println("Enter a Valid Integer :");
            sc.close();
            return;
        }
        int num = sc.nextInt();

        printTable(num);

        sc.close();
    }
}
