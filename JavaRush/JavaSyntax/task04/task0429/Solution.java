package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int posCount = 0;
        int negCount = 0;

        if (a > 0){
            posCount++;
        }
        if (b > 0){
            posCount++;
        }
        if (c > 0){
            posCount++;
        }
        if (a < 0){
            negCount++;
        }
        if (b < 0){
            negCount++;
        }
        if (c < 0){
            negCount++;
        }
        System.out.println("количество отрицательных чисел: " + negCount);
        System.out.println("количество положительных чисел: " + posCount);







    }
}
