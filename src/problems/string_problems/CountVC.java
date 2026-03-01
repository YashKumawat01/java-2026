package problems.string_problems;

import java.util.Scanner;

public class CountVC {

    public static void main(String[] args) {

        System.out.println("Enter the String :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.trim().isEmpty()) {
            System.out.println("Please Enter a valid String !");
            return;
        }

        str = str.toLowerCase();
        str = str.replaceAll("[^a-z]", "");

        int vowels = 0;
        int consonants = 0;

        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Number of Vowels : " + vowels);
        System.out.println("Number of Consonants : " + consonants);
    }
}