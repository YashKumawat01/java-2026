package basics;

import java.util.*;

public class MathsFunctions {

    public static void main(String[] args) {

//        let we have to print maximum from two number;

        double a,b;
        a=45.1;
        b=46;

        System.out.println("Maximum No is : "+Math.max(a, b));

//        let we have to print minimum from two number;

        System.out.println("Minimum No is : "+Math.min(a, b));

//        Random Function return random no. from 0.0 to 1.0

        System.out.println(Math.random()); // this print value in long form

        System.out.println((int)(Math.random()*10));


    }
}
