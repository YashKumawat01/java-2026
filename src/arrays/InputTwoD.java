package arrays;

import java.util.Scanner;

public class InputTwoD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 0;
        int cols = 0;

        System.out.print("Enter number of rows: ");

        if(sc.hasNextInt()){
            rows = sc.nextInt();
        } else {
            System.out.println("Invalid input. Rows must be an integer.");
            sc.close();
            return;
        }

        System.out.print("Enter number of columns: ");

        if(sc.hasNextInt()){
            cols = sc.nextInt();
        } else {
            System.out.println("Invalid input. Columns must be an integer.");
            sc.close();
            return;
        }

        if(rows <= 0 || cols <= 0){
            System.out.println("Rows and columns must be greater than 0.");
            sc.close();
            return;
        }

        if(rows > 1000 || cols > 1000){
            System.out.println("Matrix size too large.");
            sc.close();
            return;
        }

        int[][] matrix = new int[rows][cols];

        inputMatrix(matrix,sc);

        System.out.println("Here is Your 2-D Array :");
        printMatrix(matrix);

        sc.close();

    }

    public static void inputMatrix(int[][] matrix, Scanner sc){
        System.out.println("Now Enter elements for your Array :");

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j]=sc.nextInt();
            }
        }


    }

    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}