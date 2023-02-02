package ObjectsAndClasses.tests;

import ObjectsAndClasses.BankAccount;

import java.util.ArrayList;

public class BankAccountTester3 {
    public static void main(String[] args) {
        ArrayList<BankAccount> accoountList = new ArrayList<>();

        accoountList.add(new BankAccount("11111","Homer Simpson"));
        accoountList.add(new BankAccount("22222","Bart Simpson"));
        accoountList.add(new BankAccount("33333","Merge Simpson"));

        accoountList.get(0).deposit(1000);
        accoountList.get(1).withdraw(500);
        accoountList.get(2).deposit(150);


        for(BankAccount item: accoountList){
            System.out.println("Account Number: "+item.getAccountNumber());
            System.out.println("Account Name :"+item.getAccountName());
            System.out.println("Bal: "+item.getBalance());
        }

    }
}
