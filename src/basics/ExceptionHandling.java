package basics;

public class ExceptionHandling {

    public static void main(String[] args) {

//        Try Catch in Exception Handling

        int[] marks = {56, 87, 89};

//      ***************  Without Exception Handling *****************************************

//        System.out.println(marks[5]);

//      As the above condition have error/exception the statement aslo not print

//        System.out.println("Student name is Yash");

//      *************************************************************************************


        try{
            System.out.println(marks[2]);
            System.out.println(marks[5]);
        } catch (Exception exception){
            System.out.println("There is Something wrong :(");
        }
            System.out.println("Student Name is Yash");

    }
}
