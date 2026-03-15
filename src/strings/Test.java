package strings;

public class Test {

//    String vs StringBuilder

    public static void main(String[] args) {


//        ::::::::::: String vs StringBuilder ::::::::::::::

        String str = "Yash";
        System.out.println(str);  // O/p : Yash


        str = str +" Kumawat"; // creates new object

        System.out.println(str); // O/p : Yash Kumawat


        StringBuilder sb = new StringBuilder("Sanju");
        sb.append(" Saini");  //modify same object



//        ::::::::::: charAt() ::::::::::::::

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));


//        ::::::::::: substring() ::::::::::::::

        String newStr = "Programming";

        System.out.println(newStr.substring(0,5)); // O/p : Progr
        System.out.println(newStr.substring(5));  // O/p : amming



//        ::::::::::: toCharArray() ::::::::::::::

        char[] arr = newStr.toCharArray();

        for (char a : arr){
            System.out.println(a);
        }


//        ::::::::::::: Hashing Character ::::::::::::::::

        System.out.println("Hashing Character ");

        int[] freq = new int[26];

        String sup = "apple";

        for(char c : sup.toCharArray()){
            freq[c - 'a']++;
        }
        for(int i=0;i<26;i++){

            if(freq[i] > 0){

                char ch = (char)(i + 'a');

                System.out.println(ch + " = " + freq[i]);

            }

        }



    }
}
