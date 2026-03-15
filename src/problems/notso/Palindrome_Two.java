package problems.notso;

public class Palindrome_Two {

//    Check palindrome ignoring spacees and punctuation

    public static void main(String[] args) {
//        String str = "Bulb";
//        String str = "Madam";
//        String str = "Racecar";
//        String str = "meme";
//        String str = "heeh";


        String str = "A man, a plan, a canal: Panama";

        str = str.toLowerCase().replaceAll("[^a-z0-9]","");

        boolean reslut = isPalindrome(str);

        if(reslut){
            System.out.println("Yes , Palindrome");
        }
        else{
            System.out.println("No , Palindrome");
        }
    }

    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;

        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
