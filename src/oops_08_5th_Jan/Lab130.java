package src.oops_08_5th_Jan;

public class Lab130 {
    public static void main(String[] args) {

        // Strings are Immutable---- not change

        String name = "Pramod"; // String constant pool
        String name2 = new String("Pramod");// Heap area

        name = " Dutta";

        /*
        String str1 = "Hello";
        String str2 = str1.concat("World");
        String str3 = "World";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

         */

        /*
        String str1 = "Hello";
        str1 = str1.concat("World");
        System.out.println(str1);
        String str2 = "Hello"; // both pointing to str1
        String str3 = "Hello"; //


         */

        String str1 = "Hello";  // strores permanately
        str1.concat("Pramod"); // Garbage collector in future
        System.out.println(str1);
    }
}
