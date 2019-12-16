package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int count = 0;
        int b = a;
        while (b > 0){
            count++;
            b/=10;
        }
        if (a % 2 == 0){
            switch (count){
                case 1:
                    System.out.println("четное однозначное число");
                    break;
                case 2:
                    System.out.println("четное двузначное число");
                    break;
                case 3:
                    System.out.println("четное трехзначное число");
                    break;
            }
        }
        else {
            switch (count) {
                case 1:
                    System.out.println("нечетное однозначное число");
                    break;
                case 2:
                    System.out.println("нечетное двузначное число");
                    break;
                case 3:
                    System.out.println("нечетное трехзначное число");
                    break;
            }
        }


    }
}
