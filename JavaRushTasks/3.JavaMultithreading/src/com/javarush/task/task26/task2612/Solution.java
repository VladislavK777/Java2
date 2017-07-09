package com.javarush.task.task26.task2612;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* 
Весь мир играет комедию
*/
public class Solution {
    private Lock lock = new ReentrantLock();

    public void someMethod() {
        lock.lock();
        try {
            if (lock.tryLock()) {
                lock.lockInterruptibly();
                try {
                    ifLockIsFree();
                } finally {
                    lock.unlock();
                }
            } else {
                ifLockIsBusy();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //implement logic here, use the lock field
    }

    public void ifLockIsFree() {
    }

    public void ifLockIsBusy() {
    }
}
