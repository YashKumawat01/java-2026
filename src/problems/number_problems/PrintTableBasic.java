package problems.number_problems;

import java.util.*;

public class PrintTableBasic {

    public static int[] generateTable(int n) {
        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = n * i;
        }

        return table;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number for Table :");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] table = generateTable(num);

        for (int i = 0; i < table.length; i++) {
            System.out.println(num + " x " + (i + 1) + " = " + table[i]);
        }
    }
}
