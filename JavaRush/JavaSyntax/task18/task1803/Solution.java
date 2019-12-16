package com.javarush.task.task18.task1803;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        Map <Integer , Integer> testList = new TreeMap<>();
        int maxCount = 0;

        // заполняем мапу шаблоном для сравнения (решил не делать заполнение и сравнение в одном цикле)
        for (int i = 1; i < 256 ; i++){ testList.put(i, 0);}
        while (fileInputStream.available() > 0) {
            int temp = fileInputStream.read();
            for (Map.Entry <Integer, Integer> entry : testList.entrySet() ){
                Integer key = entry.getKey();
                Integer value = entry.getValue();
                if(key.equals(temp)){
                    testList.put(key, value +1);
                }
            }
        }
        // закрываем потоки
        reader.close();
        fileInputStream.close();
        // сравниваем байты с шаблоном
        for (Map.Entry <Integer, Integer> entry : testList.entrySet() ){
            Integer value = entry.getValue();
            if (value > maxCount){maxCount = value;}
        }
        // выводим результат
        for (Map.Entry <Integer, Integer> entry : testList.entrySet() ){
            Integer value = entry.getValue();
            Integer key = entry.getKey();
            if (maxCount == value){
                System.out.print(key + " ");
            }
        }
        // Без стандартных методов!
    }
}
