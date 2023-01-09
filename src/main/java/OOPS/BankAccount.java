package OOPS;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String name;
    private String email;
    private String phoneNumber;

    public void depositFound(double found){
        accountBalance = accountBalance + found;
        System.out.println("Your current balance is $" + accountBalance);
    }
    public void withdrawing(double found) {
        if (accountBalance - found >= 0) {
            accountBalance = accountBalance - found;
            System.out.println("Your current balance is $" + accountBalance);
        } else {
            System.out.println("Insufficient Founds! You only have $"+accountBalance+" in your account");
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String accountNumber, double accountBalance, String name, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
