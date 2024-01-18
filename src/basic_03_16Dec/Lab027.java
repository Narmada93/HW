package src.basic_03_16Dec;

public class Lab027 {
    public static void main(String[] args) {

        //Casting - mould

        byte b = 10;

       // int a = b; // Implicit casting - JVM
        int a = (int) b;  // Explicit - JVM

        //
        int a1 = 300;
       // byte b1 = a1; Invalid  - implicit
        byte b1 = (byte)a1; // EXplicit
        System.out.println(b1);

    }
}
