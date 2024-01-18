package src.basic_03_16Dec;

public class Lab018 {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        System.out.println(a+b);
        String name = " Pramod";
        System.out.println(a+name);//10Pramod
        System.out.println(name+a);//Pramod10
        // When we do calculation left to right
        System.out.println(a+b+name);//55Pramod
        System.out.println(a+name+b);
        System.out.println(name+a+b);//Pramod1045
    }
}
