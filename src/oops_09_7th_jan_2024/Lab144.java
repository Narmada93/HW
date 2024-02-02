package src.oops_09_7th_jan_2024;

public class Lab144 {

    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();
        sbi.printDetails();

        System.out.println("---------------------");

        BankAccount hdfc = new BankAccount("HDFC","hdfc002");
        hdfc.printDetails();

        BankAccount icici = new BankAccount("ICICI","ICICI003");
        icici.printDetails();

    }
}
