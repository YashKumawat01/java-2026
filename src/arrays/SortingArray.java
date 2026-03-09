package arrays;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        int[] intArray = {50, 10, 25, 1, 17};
        Arrays.sort(intArray); // Sorts the entire array
        System.out.println("Sorted int array: " + Arrays.toString(intArray));

        char[] character =  {'a','b','Z','F','C','c','d'};
        Arrays.sort(character);
        System.out.println(Arrays.toString(character));

        int[] unicodes = {'a','b','Z','F','C','c','d'};
        System.out.println("Unicodes Before Sorting "+Arrays.toString(unicodes));

        Arrays.sort(unicodes);
        System.out.println("Unicodes After Sorting "+Arrays.toString(unicodes));

//        In Above methods we sort whole Arrays

//        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

//        But Now we Sort some part of Arrays or sub-arrays

//        sort(array, fromIndex, toIndex) : sort from(fromIndex) to (toIndex-1)

        int[] numbers = {5,3,1,2,0,-52,-2};

        Arrays.sort(numbers , 3,7);
        System.out.println("Sorting Sub Array : "+ Arrays.toString(numbers));

//        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

//        Sorting String Arrays

        String[] str = {"hiij","abc","dgh","baa"};
        Arrays.sort(str);
        System.out.println("Sorting String Arrays : "+ Arrays.toString(str));


    }
}
