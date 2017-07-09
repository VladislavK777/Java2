package com.javarush.task.task28.task2802;


import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пишем свою ThreadFactory
*/
public class Solution {
    private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        class EmulateThreadFactoryTask implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }

        ThreadGroup group = new ThreadGroup("firstGroup");
        Thread thread = new Thread(group, new EmulateThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("secondGroup");
        Thread thread2 = new Thread(group2, new EmulateThreadFactoryTask());

        ThreadGroup group3 = new ThreadGroup("threeGroup");
        Thread thread3 = new Thread(group3, new EmulateThreadFactoryTask());

        thread.start();
        thread2.start();
        thread3.start();
    }

    private static void emulateThreadFactory() {
        AmigoThreadFactory factory = new AmigoThreadFactory();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }

    public static class AmigoThreadFactory implements ThreadFactory {
        AtomicInteger poolNumber = new AtomicInteger(0);
        AtomicInteger threadNumber = new AtomicInteger(0);
        String namePrefix;
        ThreadGroup group;

        AmigoThreadFactory() {
            poolNumber.set(count.incrementAndGet());
        }

        @Override
        public Thread newThread(Runnable r) {
            threadNumber.getAndIncrement();
            group = Thread.currentThread().getThreadGroup();
            namePrefix = group.getName() + "-pool-" + poolNumber.intValue() + "-thread-" + threadNumber.intValue();
            Thread t = new Thread(group, r, namePrefix, 0);

            if (t.isDaemon()) {
                t.setDaemon(false);
            }
            if (t.getPriority() != Thread.NORM_PRIORITY) {
                t.setPriority(Thread.NORM_PRIORITY);
            }
            return t;
        }
    }
}
