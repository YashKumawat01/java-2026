package arrays;

public class TwoDarray {

    public static void main(String[] args) {

//        Here We Start 2-D array

        int[][] arr = new int[3][3];

//        +---+---+---+
//        | 0 | 0 | 0 |     arr[0]
//        +---+---+---+
//        | 0 | 0 | 0 |     arr[1]
//        +---+---+---+
//        | 0 | 0 | 0 |     arr[2]
//        +---+---+---+


        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(matrix[0][2]);   // For print single element from matrix


//        For Printing Matrix:

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
