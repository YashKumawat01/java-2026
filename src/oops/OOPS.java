package oops;
import java.util.*;


//class Pen{
//    String color;  //Properties
//    String type;   //Properties
//
//    public void write(){
//
//        System.out.println("Writing Program :) for " + this +"\n");
//    }
//
//    public void printProperties(){
//        System.out.println("This  is For "+this.color+" Pen");
//        System.out.println("Its type is "+this.type);
//    }
//
//    @Override
//    public String toString() {
//        return color + " " + type + " Pen";
//    }
//}

class Student{
    String name;
    int age;

    public void printStudent(){
        System.out.println(" Welcome,"+this);
    }

    public void printInfo(){
        System.out.println("Student name is "+this.name);
        System.out.println("Student age is "+this.age);
    }
@Override
    public String toString(){
        return name +" your age is "+age;
    }

    Student(){
        System.out.println("Student  Called as a Constructor");
    }
}
public class OOPS {

    public static void main(String[] args) {

//        Pen pen1 = new Pen();
////        System.out.println(pen1);
//        Pen pen2 = new Pen();
//        Pen pen3 = new Pen();
//
//        pen1.color="Red";
//        pen1.type="Ballpoint";
//        pen1.write();
//        pen1.printProperties();
//
//        pen2.color="Blue";
//        pen2.type="Gel";
//        pen2.write();
//        pen2.printProperties();

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name="Yash Kumawat";
        s1.age=24;
        s2.name="Rohit";
        s2.age=20;

        s1.printStudent();
//        s1.printInfo();
        s2.printStudent();
    }
}
