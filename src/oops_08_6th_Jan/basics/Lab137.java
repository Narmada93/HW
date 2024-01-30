package src.oops_08_6th_Jan.basics;

import java.util.Scanner;

public class Lab137 {
    public static void main(String[] args) {


        // palindrome

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a string : ");
        String user_input = scanner.next();
        boolean result = isPalindrome(user_input);
        if(result){
            System.out.println(result +"\n "+ user_input +" is a Palindrome");
        }else{
            System.out.println(result + " It is not a Palindrome");
        }

    }

    private static boolean isPalindrome(String userInput) {

        String original_str = userInput;
        StringBuilder sb = new StringBuilder(userInput);
        String reverse_string = sb.reverse().toString();
        return original_str.equalsIgnoreCase(reverse_string);
    }
}
