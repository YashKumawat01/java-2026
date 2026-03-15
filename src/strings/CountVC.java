package strings;

import java.util.Scanner;

public class CountVC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sc.nextLine().toLowerCase();


        int vowels =0;
        int consonants =0;


        char[] arr = str.toCharArray();

        for(char c : arr){
            if(c >='a' && c <= 'z'){

                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }

        System.out.println("Number of Vowels in String : "+vowels);
        System.out.println("Number of Consonants in String : "+consonants);
    }
}
