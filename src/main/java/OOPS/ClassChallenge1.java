package OOPS;

public class ClassChallenge1 {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdrawing(100);
        bankAccount.depositFound(250);
        bankAccount.withdrawing(50.90);
        bankAccount.withdrawing(200);
    }
}
