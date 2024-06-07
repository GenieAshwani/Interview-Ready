package Interview.Multithreading.Lock;

import java.util.concurrent.locks.ReentrantLock;

class LockDemo {
    public static void main(String[] args) {
        // Create a ReentrantLock instance
        ReentrantLock l = new ReentrantLock();
        l.lock();
        l.lock();

        System.out.println(l.isLocked()); // true
        System.out.println(l.isHeldByCurrentThread()); // true

        System.out.println(l.getQueueLength()); // 0

        System.out.println(l.getHoldCount()); // 2

        l.unlock();

        System.out.println(l.getHoldCount()); // 1
        System.out.println(l.isLocked()); // true

        l.unlock();
        System.out.println(l.isLocked()); // false

        System.out.println(l.isFair()); // false
    }
}

