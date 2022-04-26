package day25Callable;
// Java program to illustrate callable to return a random number

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableExample implements Callable {

    @Override
    public Object call() throws Exception {
        Random generator = new Random();

        Integer randomNumber = generator.nextInt(5);
        // to simulate a heavy computation, we delay the thread for some random time
        Thread.sleep(randomNumber * 1000);

        return randomNumber;
    }
}
class CallableFutureTest{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       // FutureTask is a concrete class that implements both runnable and Future
        FutureTask[] randomNumberTasks = new FutureTask[5];
        for (int i = 0; i<5; i++){
            Callable callable = new CallableExample();

            // create the FutureTask with Callable
            randomNumberTasks[i] = new FutureTask(callable);

            // As it implements Runnable, create Thread with FutureTask
            Thread t = new Thread(randomNumberTasks[i]);
            t.start();
        }
        for(int i =0; i< 5; i++){
            // As it implements Future, we can call get()
            System.out.println(randomNumberTasks[i].get());

            // This method blocks till the result is obtained
            // The get method can throw checked exceptions like when it is interrupted.
            // This is the reason for adding the throws clause to main
        }
    }
}