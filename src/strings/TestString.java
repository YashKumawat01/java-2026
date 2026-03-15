package strings;

public class TestString {

    public static void main(String[] args) {

//        Mene ek class banayi hai "Student" naam se or usse yaha access kar rha hu :::

        Student student = new Student();

        student.name = "YASH";
        student.address = "Jaipur";
        student.rollNumber = 20;
        student.standard = 4;

        System.out.println(student.name);
        System.out.println(student.address);
        System.out.println(student.rollNumber);
        System.out.println(student.standard);
    }
}
