package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ThreadTest1());
        threads.add(new ThreadTest2());
        threads.add(new ThreadTest3());
        threads.add(new ThreadTest4());
        threads.add(new ThreadTest5());
    }

    public static void main(String[] args) {
    }

    public static class ThreadTest1 extends Thread {
        public void run() {
            while (true) {

            }
        }
    }

    public static class ThreadTest2 extends Thread {
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThreadTest3 extends Thread {
        public void run() {
            while (!isInterrupted()) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static class ThreadTest4 extends Thread implements Message {
        public void showWarning() {
            this.interrupt();
        }
        public void run() {
            showWarning();
        }
    }

    public static class ThreadTest5 extends Thread {
        public void run() {
            BufferedReader bRd = new BufferedReader(new InputStreamReader(System.in));
            int total = 0;
            while (!isInterrupted()) {
                String s;
                try {
                    while (!"N".equals(s = bRd.readLine())) {
                        total =total + Integer.parseInt(s);
                    }
                    System.out.println(total);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}