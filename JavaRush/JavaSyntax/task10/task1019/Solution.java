package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем мапу
        HashMap <String, Integer> map = new HashMap<>();
         //считываем данные и складываем в коллекции
        while(true) {
            String idString = reader.readLine();
            if(idString.isEmpty()){
                break;
            }
            String name = reader.readLine();
            int id = Integer.parseInt(idString);
            map.put(name, id);
        }
        //готовим вывод в консоль
        for(Map.Entry<String, Integer> pair : map.entrySet()){
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(value + " " + key);
        }

    }
}
