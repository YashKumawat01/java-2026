package problems.notso;

public class CountVC {

    public static void main(String[] args) {

        String str = "Hello, i am Yash Kumawat";
        str = str.toLowerCase().replaceAll("[^a-z0-9]","");

        int vowels=0;
        int consonant=0;
        int n = str.length();
        for(int i=0; i<n; i++){

            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vowels++;
            }
            else{
                consonant++;
            }
        }
        System.out.println("Vowels are : " + vowels);
        System.out.println("Consonants are : " + consonant);
    }
}
