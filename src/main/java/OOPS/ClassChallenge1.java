package OOPS;

import OOPS.BankAccount;

public class ClassChallenge1 {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("12343",100,"jackson","jackson@gmail.com","094343443");
        bankAccount.withdrawing(100);
        bankAccount.depositFound(250);
        bankAccount.withdrawing(50.90);
        bankAccount.withdrawing(200);
    }
}
