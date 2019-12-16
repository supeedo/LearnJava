package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int [20];
        int [] arr1 = new int [10];
        int [] arr2 = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
            if (i < 10){
                arr1[i] = array[i];
            }
        }
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = array[i+10];
            System.out.println(arr2[i]);
        }
    }
}
