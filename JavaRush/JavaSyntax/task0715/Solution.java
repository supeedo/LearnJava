package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<String>();
        array.add("мама");
        array.add("мыла");
        array.add("раму");
        array.add(1,"именно");
        array.add(3,"именно");
        array.add(5,"именно");

        for(String x : array){
            System.out.println(x);

        }
    }
}

