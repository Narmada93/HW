package src.basics_05_23Dec;

public class Lab084 {
    public static void main(String[] args) {
// About break
        // "IF" condition does not contain break statement. It is possible only "FOR" loop

        /* int a=10;
        if(a==10){
        break;   //not posible in IF
        }
         */

       /*
        for(int i=0;i<10;i++) {
            System.out.println(i);
            break;
            System.out.println("** INSIDE LOOP **");  // After break statement is not possible
        }
*/

         /*
        for(int i=0;i<10;i++) {
            System.out.println(i);
            break; // print only one value i.e 0

        }
*/

        for(int i=0;i<10;i++) {
            System.out.println(i);
            if(i%2==0) {
                break;
            }
        }


    }
}
