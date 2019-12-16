package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());
    }

    public static void main(String[] args) {
        for (Thread thread: threads) {
            thread.start();
            //System.out.println(thread.getId());
        }
    }


    public static class MyThread1 extends Thread{
        @Override
        public void run() {
            while (true){}
         }
    }
    public static class MyThread2 extends Thread{
        @Override
        public void run() {
            try {
                currentThread().sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
                e.printStackTrace();
            }
        }
    }
    public static class MyThread3 extends Thread{
        @Override
        public void run() {
            while (true){
                System.out.println("Ура");
                try {
                    currentThread().sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class MyThread4 extends Thread implements Message{

        @Override
        public  void showWarning() {
            this.interrupt();
        }
        @Override
        public void run() {
            while(!this.isInterrupted()){}
        }
    }
    public static class MyThread5 extends Thread{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        @Override
        public void run() {
             while(true){
                try {
                    String s = reader.readLine();
                    if(s.equals("N")){
                        break;
                    }
                    count += Integer.parseInt(s);
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
                catch (NumberFormatException e){}
             }
            System.out.println(count);
        }
    }
}