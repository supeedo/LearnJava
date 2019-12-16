package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while(bufferedReader.ready()){
            StringBuilder sb = new StringBuilder();
            sb.append(bufferedReader.readLine()).reverse();
            System.out.println(sb.toString());
        }
        fileReader.close();
        bufferedReader.close();
    }
}
