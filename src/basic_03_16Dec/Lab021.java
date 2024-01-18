package src.basic_03_16Dec;

public class Lab021 {
    public static void main(String[] args) {
        //Relational Operator
        System.out.println( 10 == 10 );
        System.out.println( 10 >= 10 );
        System.out.println( 10 <= 10 );
        System.out.println( 10 < 10 );
        System.out.println( 10 > 10 );

        System.out.println("-----------------");

        //        System.out.println('A' = 65 );// Assign is not possible

        System.out.println('A' == 65 );// ASCII

        byte b = 65;
        System.out.println('A'== b);// in SOP b(byte) becomes int
        System.out.println('A' == 65.0);// double
        System.out.println('A' == 65.0f);// float
        System.out.println('A' == 65.2);// Not possible

        //System.out.println( true == 0); boolean int comparision is not posible
        //System.out.println( true >= true); comparision b/w boolean is not posible

    }
}
