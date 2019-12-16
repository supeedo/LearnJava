package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int [] array = new int [fileInputStream.available()];
        int count = 0;
        while (fileInputStream.available() > 0){
            for (int i = 0; i < array.length; i++){
                array[i] = fileInputStream.read();
                if(array[i] == 44){
                    count++;
                }
            }
        }
        reader.close();
        fileInputStream.close();
        System.out.println(count);
    }
}
