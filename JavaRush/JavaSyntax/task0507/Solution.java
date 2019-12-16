package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double count = 0;
        double average = 0;
        while (true){
            String sA = reader.readLine();
            double a = Double.parseDouble(sA);
            if ( sA.equals("-1")){
                //   System.out.println(sum/count);
                break;
            }
            sum += a;
            count++;
        }
        average = sum / count;
        if( average != 0)
            System.out.println(average);
        else
            System.out.println(sum);

    }
}

