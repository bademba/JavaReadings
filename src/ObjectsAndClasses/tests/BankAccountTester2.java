package ObjectsAndClasses.tests;

import ObjectsAndClasses.BankAccount;

public class BankAccountTester2 {
    public static void main(String[] args) {
        BankAccount[] accountList = new BankAccount[3];
        accountList[0] = new BankAccount("111111","Susan Richards");
        accountList[1] = new BankAccount("222222","Homer Simpson");
        accountList[2] = new BankAccount("333333","Bart Simpsons");

        accountList[0].deposit(1000);
        accountList[1].deposit(150);
        accountList[2].withdraw(500);

        for (BankAccount item: accountList){
            System.out.println("Account Number: "+item.getAccountNumber());
            System.out.println("Account Name :"+item.getAccountName());
            System.out.println("Bal: "+item.getBalance());

        }
    }
}
