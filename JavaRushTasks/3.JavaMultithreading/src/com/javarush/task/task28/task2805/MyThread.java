package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by vladislavklockov on 18.06.17.
 */
public class MyThread extends Thread {
    static AtomicInteger count = new AtomicInteger(0);

    static {
        Thread.currentThread().setPriority(count.incrementAndGet());
    }

    public MyThread() {
        Thread.currentThread().setPriority(count.incrementAndGet());
        if (count.get() == MAX_PRIORITY) {
            count = new AtomicInteger(0);
        }
    }


    public MyThread(Runnable target) {
        super(target);
        Thread.currentThread().setPriority(count.incrementAndGet());
        if (count.get() == MAX_PRIORITY) {
            count = new AtomicInteger(0);
        }
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        Thread.currentThread().setPriority(count.incrementAndGet());
        if (count.get() == MAX_PRIORITY) {
            count = new AtomicInteger(0);
        }
    }

    public MyThread(String name) {
        super(name);
        Thread.currentThread().setPriority(count.incrementAndGet());
        if (count.get() == MAX_PRIORITY) {
            count = new AtomicInteger(0);
        }
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        Thread.currentThread().setPriority(count.incrementAndGet());
        if (count.get() == MAX_PRIORITY) {
            count = new AtomicInteger(0);
        }
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        Thread.currentThread().setPriority(count.incrementAndGet());
        if (count.get() == MAX_PRIORITY) {
            count = new AtomicInteger(0);
        }
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        Thread.currentThread().setPriority(count.incrementAndGet());
        if (count.get() == MAX_PRIORITY) {
            count = new AtomicInteger(0);
        }
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        Thread.currentThread().setPriority(count.incrementAndGet());
        if (count.get() == MAX_PRIORITY) {
            count = new AtomicInteger(0);
        }
    }
}
