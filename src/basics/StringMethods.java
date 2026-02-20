package basics;

public class StringMethods {
    public static void main(String[] args) {

//        String Methods

//        1. Concatinate
        String name1 = "Yash";
        String name2 = "Kumawat";
        String name3 = name1+" and "+name2;

        System.out.println(name3);

//        2. charAt
        System.out.println(name3.charAt(6));
        System.out.println(name3.charAt(9));
//        System.out.println(name3.charAt(65));  // error : out of length


//        3. replace
        String replaceName = name3.replace('a','z');
        System.out.println(replaceName);

//        4. Substring

        System.out.println(name3.substring(0,4));

    }
}
