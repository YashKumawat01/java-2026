package problems.notso;

public class CountOccurenece {

    public static void main(String[] args) {
        String str = "Yash Kumawat";
        str = str.toLowerCase();

        char find = 'a';

        int result = checkOccurenece(str,find);
        System.out.println("Number of Occurence : " + result);
    }

    public static int checkOccurenece(String str, char find){
        int result=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==find){
                result++;
            }
        }
        return result;
    }
}
