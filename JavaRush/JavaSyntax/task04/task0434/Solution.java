package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int a = 1;
            while (a <=10){
                int b = 1;
                int i = 1;
                while(i <=10){
                    System.out.print((a*b) + " ");
                    i++;
                    b++;
                }
                System.out.println();
                a++;
            }
    }
}
