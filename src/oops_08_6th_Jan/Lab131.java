package src.oops_08_6th_Jan;

public class Lab131 {
    public static void main(String[] args) {

        //String functions

        // concat, contains

        String name = "Pramod";
        System.out.println(name.concat(" Dutta"));
        System.out.println(name+ " Dutta");
        System.out.println(name.contains("t"));
        System.out.println(name.contains("a"));
        System.out.println(name);

        String name2 = new String("Dutta");

        // equalsIgnoreCase

        String expected_result = "Password@123";
        String actual_result = "password@123";

        if (expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("YES");
        }

    }
}
