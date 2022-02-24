package day6;

import java.util.logging.Logger;

public class BankEncapsulationPractice {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setAccountNumber("111111111111");
        account1.setAccountHolderName("Shivaraj");
        account1.deposit(account1, 500);

        BankAccount account2 = new BankAccount();
        account2.setAccountNumber("22222222222");
        account2.setAccountHolderName("Subina Shrestha");
        //TODO need to replace this set account balance as well
        account2.deposit(account2, 1000);

        //InterestCalculation
//        account1.addInterest(account1);

        Logger.getGlobal().info("*******Before transfer**********");
        Logger.getGlobal().info(String.valueOf("Account 1: " + account1.getAccountBalance()));
        Logger.getGlobal().info(String.valueOf("Account 2: " + account2.getAccountBalance()));

        //Balance transfer(from account 2 to account 1, amount 500)
//       transferBalance(account1, account2);
       account1.transferBalance(account2, account1);

        Logger.getGlobal().info("******After transfer********");
        Logger.getGlobal().info(String.valueOf("Account 1:" + account1.getAccountBalance()));
        Logger.getGlobal().info(String.valueOf("Account 2: " + account2.getAccountBalance()));

    }

}
