package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        int year = Integer.parseInt(sYear);
        int a = 365;
        int b = 366;
            if (year % 4 !=0 ){
                System.out.println("количество дней в году: " + a);
            }
            else if ( year % 100 == 0 && year % 400 != 0){
                System.out.println("количество дней в году: " + a);
            }
            else
                System.out.println("количество дней в году: " + b);
        

    }
}