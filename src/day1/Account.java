package day1;

public class Account {
    //states
    //account number
//    long accountNumber; // As we are not doing mathematical calculation we can use string for account number
    private String accountNumber1;
    //account type
    private String accountType;
    //account name
    private String accountName;
    //amount
    private double amount;
    //interest rate
    private final float INTEREST_RATE = 7.05f;
    //KYC data
    private String address;
    private String socialSecurityNumber;
    private String phoneNumber;

    //Getter and Setter


    public String getAccountNumber1() {
        return accountNumber1;
    }

    public void setAccountNumber1(String accountNumber1) {
        this.accountNumber1 = accountNumber1;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

     public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //behaviour
    //open account
    public void openAccount(String accountName, String accountType, double amount, String address){}
    // transfer balance
    public boolean transferBalance(String accountForm, String accountTo, double amountToTransfer){
        return true;
    }
    // add interest
    public void addInterest(String accountNumber){}
    // deposit amount
    public void depositAmount(String accountNumber, double accountToBeDeposited){}
    //close account
    public boolean closeAccount(String accountNumber){
        return true;
    }
}
