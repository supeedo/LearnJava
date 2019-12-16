package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int sum1, sum2;
        if (a >= b){
            sum1 = a;
        }
        else{
            sum1 = b;
        }
        if (c >= d){
            sum2 = c;
        }
        else{
            sum2 = d;
        }
        if (sum1 >= sum2){
            System.out.println(sum1);
        }
        else{
            System.out.println(sum2);
        }

    }
}
