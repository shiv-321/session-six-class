package day6;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private final float INTEREST_RATE = 0.05f;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public float getINTEREST_RATE() {
        return INTEREST_RATE;
    }

    //addBalance
    public void deposit(BankAccount account, double amount){

        this.accountBalance += amount;
    }
    //transferBalance
    public void transferBalance(BankAccount toAccount, BankAccount fromAccount){
        //TODO check if the balance is sufficient or not to transfer
        fromAccount.setAccountBalance(fromAccount.getAccountBalance()-500);
        toAccount.setAccountBalance(toAccount.getAccountBalance() +500);

    }
    //addInterest
    public void addInterest(BankAccount account){
        double interest = (account.getAccountBalance() * 1 *INTEREST_RATE);
        System.out.println("Principle amount: " + account.getAccountBalance());
        System.out.println("Interest: " + interest);
        account.setAccountBalance(account.getAccountBalance() + interest);
        System.out.println("Account 1 balance: " + account.getAccountBalance());

    }




}
