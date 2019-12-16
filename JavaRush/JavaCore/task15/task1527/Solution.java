package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            String[] arr = s.split("\\?+|&+|=");
            for (int i = 1; i < arr.length; i++){
                if(arr[i].equals("lvl") || arr[i].equals("obj") || arr[i].equals("name")|| arr[i].equals("view")){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();

            for (int i = 1; i < arr.length; i++){
                if (arr[i].equals("obj")){
                    try {
                       Double a = Double.parseDouble(arr[i+1]);
                        alert(a);
                    } catch (NumberFormatException e) {
                        alert(arr[i+1]);
                    }

                }
            }



        }
        catch(NumberFormatException e){}

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
