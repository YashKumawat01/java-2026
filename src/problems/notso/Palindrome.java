package problems.notso;

public class Palindrome {

    public static void main(String[] args) {

        String str1 = "racecar";
//        String str2 = "Hello";

        str1=str1.toLowerCase().replaceAll("[^a-z0-9]"," ");
//        str2=str2.toLowerCase().replaceAll("[^a-z0-9]"," ");
        int n = str1.length();
        boolean isPalindrome = checkPalindrome(str1,n);

//        for Str 1 :
        if(isPalindrome){
            System.out.println("Its palindrome");
        }
        else{
            System.out.println("No palindrome");
        }

    }

    public static boolean checkPalindrome(String str1, int n){
        for(int i =0; i<n; i++){
            if(str1.charAt(i)!=str1.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
