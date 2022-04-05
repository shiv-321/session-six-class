package day25C;

public class BankThreadTest {

    public static final int STEPS = 1000;
    public static final double MAX_AMOUNT = 1000;

    public static void main(String[] args) {
        Bank bank = new Bank(4, 10000);
        Runnable task1 = () -> {
            try{
                for (int i = 0; i<STEPS; i++){
                    double amount = MAX_AMOUNT * Math.random();
                    bank.transfer(0, 1, amount);
                }
            }catch (Exception e){

            }finally {
                System.out.printf("Total Balance by task 1: %10.2f" + bank.getTotalBalance());

            }
        };
        Runnable task2 = () -> {
            try{
                for (int i =0; i<STEPS; i++){
                    double amount = MAX_AMOUNT*Math.random();
                    bank.transfer(2, 3, amount);
                    }
                }catch (Exception e){

            }finally {
                System.out.printf("Total Balance by task 2: 10.2%f", + bank.getTotalBalance());
            }
        };
        Thread thread = new Thread(task1);
        thread.start();
        Thread thread1 = new Thread(task2);
        thread1.start();
    }
}
