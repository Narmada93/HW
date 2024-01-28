package src.oops_08_6th_Jan;

public class Lab132 {
    public static void main(String[] args) {
        //   equals

        String s1 = "Pramod";
        String s2 = new String ("Pramod");
        String s3 = new String ("pramod");
        System.out.println(s1 == s2); // checks memory allocation i..e reference
        System.out.println(s1.equals(s2)); //checks elements i.e actual content
        System.out.println(s1.equalsIgnoreCase(s3));

    }
}
