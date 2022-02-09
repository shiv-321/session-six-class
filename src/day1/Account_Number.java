package day1;

public class Account_Number {
    //states
    //account number
    long accountNumber; // As we are not doing mathematical calculation we can use string for account number
    String accountNumber1;
    //account type
    String accountType;

    //account name
    String accountName;

    //amount
    double amount;

    //interest rate
    final float interestRate = 7.05f;

    //KYC data
    String address;
    String socialSecurityNumber;
    String phoneNumber;
    String name;

    // bonus
    float bonus;

    //behaviour
    //open account
    void openAccount(String accountName, String accountType, double amount, String address){}
    // transfer balance
    boolean transferBalance(String accountForm, String accountTo, double amountToTransfer){
        return true;
    }
    // add interest
    void addInterest(String accountNumber){}
    // deposit amount
    void depositAmount(String accountNumber, double accountToBeDeposited){}
    //close account
    boolean closeAccount(String accountNumber){
        return true;
    }
}
