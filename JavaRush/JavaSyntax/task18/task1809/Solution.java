package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        int n = fileInputStream.available();
        int [] array = new int [n];
        while(fileInputStream.available() > 0){
            for (int i = n-1; i >= 0; i--){
                array[i] = fileInputStream.read();
            }
        }
        for(Integer i : array){
            fileOutputStream.write(i);
        }
        reader.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
