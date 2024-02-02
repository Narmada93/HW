package src.oops_09_7th_jan_2024;

public class ATBPerson {

    String name; // Instance variable values are default
    long phone;
    String email;
    boolean isMarried;
    String courseName;

    // Default Constructor
    ATBPerson(){
        courseName = "ATB";
        System.out.println("I am Default!");
    }

    // Param Constructor
    ATBPerson(String valuefromObjectRef){
        this.name = valuefromObjectRef;
    }

    void talk(){
        System.out.println(" Talk!!");
    }

    void printDetails(){
        System.out.println(this.name);
        System.out.println(courseName);
    }


    /*
    void talk() {
        System.out.println("Talk");
    }


    void prinDetails() {
        System.out.println(name);
        System.out.println(phone);
        System.out.println(email);
        System.out.println(isMarried);
    }*/
}