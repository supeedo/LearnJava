package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int num = Integer.parseInt(sNum);
        if (num > 0){
            num *=2;
            System.out.println(num);
        }
        else if ( num < 0){
            num++;
            System.out.println(num);
        }
        else
            System.out.println(num);

    }

}