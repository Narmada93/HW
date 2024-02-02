package src.oops_09_7th_jan_2024;

public class BankAccount {

    String bankName;
    int balance;
    String bankCode;


    BankAccount(){
        bankName = "SBI";
        bankCode = "SBI001";
        System.out.println("Default constructor");
    }

    BankAccount(String bName, String bCode){

        this.bankName = bName;
        this.bankCode = bCode;
        System.out.println(" Paramerized constructor");
    }
    void printDetails(){
        System.out.println("Bank Name is " + bankName);
        System.out.println("Balance is " + balance);
        System.out.println("Bank code is " + bankCode);
    }
}
