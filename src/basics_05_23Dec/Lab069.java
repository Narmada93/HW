package src.basics_05_23Dec;

import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {

        //scanner

        // Take a user input and print information

        Scanner user_input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = user_input.next();

        System.out.println("Enter your age");
        int age = user_input.nextInt();

        System.out.println("Enter your salary");
        double salary = user_input.nextDouble();

        //System.out.println("Your details are "+name+ " " +age+" "+salary);
        System.out.println("Your Name "+name);
        System.out.println("Your Age "+age);
        System.out.println("Your Salary "+salary);
    }
}
