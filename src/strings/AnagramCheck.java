package strings;

public class AnagramCheck {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        int[] freq = new int[26];

        for(char c : s1.toCharArray()){
            freq[c - 'a']++;
        }

        for(char c : s2.toCharArray()){
            freq[c - 'a']--;
        }

        boolean isAnagram = true;

        for(int i : freq){
            if(i != 0){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }

    }
}
