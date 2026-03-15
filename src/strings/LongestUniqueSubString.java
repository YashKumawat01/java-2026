package strings;

import java.util.HashSet;

public class LongestUniqueSubString {

    public static void main(String[] args) {

//        String str = "abcabcbb";
        String str = "pwwekewr";

        int max = 0;

        for(int i = 0; i < str.length(); i++){

            HashSet<Character> set = new HashSet<>();

            for(int j = i; j < str.length(); j++){

                if(set.contains(str.charAt(j))){
                    break;
                }

                set.add(str.charAt(j));

                max = Math.max(max, set.size());
            }

        }

        System.out.println("Length = " + max);
    }
}