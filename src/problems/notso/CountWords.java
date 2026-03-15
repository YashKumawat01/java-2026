package problems.notso;

public class CountWords {

    public static void main(String[] args) {
        String str = "I am Yash Kumawat                  ";
        int result = countWord(str);

        System.out.println("Total words in string : " + result);

    }

    public static int countWord(String str){

        if(str == null || str.trim().isEmpty()){
            return 0;
        }

        String[] words = str.trim().split("\\s+");

        return words.length;
    }
}
