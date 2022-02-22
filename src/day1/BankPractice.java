package day1;

public class BankPractice {
    public static void main(String[] args) {
        Account account = new Account();


//        account.accountName="ABC";
//        account.accountNumber1="1234567890";
//        account.accountType = "Saving";
//        account.amount = 5000;
//        account.address= "Texas";
//        account.phoneNumber = "6823464682";
//        account.socialSecurityNumber="111223333";

        account.setAccountName("ABC");
        account.setAccountNumber1("1234567890");
        account.setAccountType("Saving");
        account.setAmount(5000);
        account.setAddress("Texas");
        account.setPhoneNumber("6823464682");
        account.setSocialSecurityNumber("111223333");

        System.out.println(account.getAccountName());
        System.out.println(account.getAccountNumber1());
        System.out.println(account.getAccountType());
        System.out.println(account.getAmount());
        System.out.println(account.getAddress());
        System.out.println(account.getPhoneNumber());
//        System.out.println(account.getSocialSecurityNumber());



    }
}
