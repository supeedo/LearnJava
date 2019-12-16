package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Double> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        BufferedReader bFileReader = new BufferedReader(new FileReader(file1));
        while (bFileReader.ready()) {
            String[] s = bFileReader.readLine().split(" ");
            for(int i = 0 ; i < s.length; i++){
                array.add((double) Math.round(Double.parseDouble(s[i])));
            }
        }
        FileWriter fileWriter = new FileWriter(file2);
        for (int i = 0; i < array.size(); i++){
           int temp = array.get(i).intValue();
            fileWriter.write(temp + " ");
        }
        reader.close();
        bFileReader.close();
        fileWriter.close();
    }
}
