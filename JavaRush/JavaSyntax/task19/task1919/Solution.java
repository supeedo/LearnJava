package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main( String[] args ) throws IOException {
        Map<String, Double> list = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while (reader.ready()) {
            String[] temp = reader.readLine().split(" ");
            if(list.get(temp[0]) == null){
                list.put(temp[0], Double.parseDouble(temp[1]));
            }
            else{
                list.put(temp[0], list.get(temp[0]) + Double.parseDouble(temp[1]));
            }
        }
        reader.close();
        for (Map.Entry<String, Double> s : list.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
