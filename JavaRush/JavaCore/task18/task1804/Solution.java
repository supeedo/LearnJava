package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> testMap = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int min = Integer.MAX_VALUE;
         // заполняем мапу шаблоном
        for (int i = 1; i < 256; i++){testMap.put(i, 0);}
        // сравниваем поток с шаблоном мапы и считаем количество повторений
        while(fileInputStream.available() > 0){
            Integer temp = fileInputStream.read();
            for(Map.Entry<Integer, Integer> entry : testMap.entrySet()){
                Integer key = entry.getKey();
                Integer value = entry.getValue();
                if (key.equals(temp)){
                   testMap.put( key, value+1);
                }
            }
        }
        // закрываем поток
        reader.close();
        fileInputStream.close();
        // нахдим минимальное значение
        for(Map.Entry<Integer, Integer> entry : testMap.entrySet()){
            if (entry.getValue() < min && entry.getValue() != 0){ min = entry.getValue();}
        }
        // выводим ключи по минимальному значению
        for(Map.Entry<Integer, Integer> entry : testMap.entrySet()){
            if(entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
