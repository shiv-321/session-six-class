package day25ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMethodPractice {
    public static void main(String[] args) {

        ReentrantLock l = new ReentrantLock();

        l.lock(); // main thread is executing this line so main thread got this lock
        l.lock(); // Reentrant means the same thread can get the lock any no. of times

        System.out.println(l.getHoldCount()); // the lock is holded by MT two times
        System.out.println(l.getQueueLength()); // how many other threads are waiting
        System.out.println(l.hasQueuedThreads()); // true if any other threads are waiting
        System.out.println(l.isLocked()); // true or false
        System.out.println(l.isFair()); //
        System.out.println(l.isHeldByCurrentThread());

        l.unlock();
        System.out.println(l.getHoldCount());

    }
}
