package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by vladislavklockov on 09.06.17.
 */
public class Producer implements Runnable {
    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    public void run() {
        Thread currentThread = Thread.currentThread();
        int i = 1;
        while (!currentThread.isInterrupted()) {
            try {
                map.put(String.valueOf(i), "Some text for " + i++);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
            }
        }
    }
}
