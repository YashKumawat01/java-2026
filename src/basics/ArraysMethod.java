package basics;

import java.util.*;
public class ArraysMethod {
    public static void main(String[] args) {

        int[] marks = new int[5];

        marks[0]=97;
        marks[1]=90;
        marks[2]=87;
        marks[3]=56;
        marks[4]=98;

        System.out.println(marks[3]);

//        What if not give value to array so it initialize with null



        int[] scores = new int[3];
        System.out.println(scores[1]);

//        print marks[] length

        System.out.println("Length of Marks array "+marks.length);

//        print sorted array
        System.out.println("Marks at position 1 before sorting "+marks[0]);
        Arrays.sort(marks);
        System.out.println("Marks at position 1 after sorting "+marks[0]);

    }
}
