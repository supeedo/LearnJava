package com.javarush.task.task17.task1712;

import java.util.ArrayList;
import java.util.List;

/* 
Ресторан
*/

public class Restaurant {
    public static List<Thread> threads = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Waiter waiterTarget = new Waiter(); //объект Официант
        Thread waiter = new Thread(waiterTarget);  //нить официанта
        threads.add(waiter); //добавление в массив нитей

        Cook cookTarget = new Cook(); //созлание повара
        Thread cook = new Thread(cookTarget);  //нить повара
        threads.add(cook);  //добавление в массив нитей

        waiter.start();  //старт нити официанта
        cook.start();  //старт нити повара

        Thread.sleep(2000);
        cookTarget.continueWorking = false;
        Thread.sleep(500);
        waiterTarget.continueWorking = false;
    }
}
