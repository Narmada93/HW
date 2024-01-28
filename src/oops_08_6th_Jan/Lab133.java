package src.oops_08_6th_Jan;

public class Lab133 {
    public static void main(String[] args) {

        //Immutable in nature (not changing)

        String s1 = "Pramod";
        String s2 = new String("Pramod");

        // String builder and buffer
        // Mutable -- it can be changed

        StringBuilder sb3 = new StringBuilder("Pramod");
        sb3.append("Dutta");
        System.out.println(sb3);

        StringBuffer sb4 = new StringBuffer("Hello");
        sb4.append("World");
        System.out.println(sb4);
    }
}
