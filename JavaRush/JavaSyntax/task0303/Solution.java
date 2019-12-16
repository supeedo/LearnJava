package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(45, 2.1) );
        System.out.println(convertEurToUsd(48, 2.1) );


    }

    public static double convertEurToUsd(int eur, double course) {
        double convert = eur * course;
        return convert;

    }
}
