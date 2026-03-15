package arrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();

//        ArrayList<String> list = new ArrayList<String>();
//        ArrayList<Boolean> list = new ArrayList<>();


//        add elements --- add element in end

        list.add(0);
        list.add(2);
        list.add(4);

        System.out.println(list);

//        get element
        System.out.println(list.get(1));
        System.out.println(list.get(0));
        System.out.println(list.get(2));

//        add element in between
        list.add(1,85);
        System.out.println(list);

//        set element

        list.set(1,65);
        System.out.println(list);

//        delete element

        list.remove(3);
        System.out.println(list);

//        size
        int size = list.size();
        System.out.println(size);

//        loops

        for(int i=0; i< list.size();i++){
            System.out.println(list.get(i));
        }

//        sorting

        Collections.sort(list);
        System.out.println("Now Sorted List : "+list);




    }

}
