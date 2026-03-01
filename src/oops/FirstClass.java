package oops;


import java.util.Scanner;

// Class representing a user
class User {
    private String name;  // Encapsulation

    // Constructor
    public User(String name) {
        this.name = name;
    }

    // Method to display welcome message
    public void welcomeUser() {
        System.out.println("You're Welcome, " + name);
    }
}

public class FirstClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = sc.nextLine();

        // Creating object
        User user = new User(userName);

        // Calling method
        user.welcomeUser();

        sc.close();
    }
}