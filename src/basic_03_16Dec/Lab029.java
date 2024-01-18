package src.basic_03_16Dec;

public class Lab029 {
    public static void main(String[] args) {

        String s1 = "Pramod";
        // String constant pool (SCP) or string pool

        // new Operator- Object

        String s2 = new String ("Pramod");
        //new operator is used to create the new object for class.
        //It returns of the address of newly created object
        System.out.println(s2);
        System.out.println( new String ("Pramod")); // both are not equal


        //s1==s2  Reference are not equal , stores different memory
        //s1.equals(s2) Values are equal
    }
}
