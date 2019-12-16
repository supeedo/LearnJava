package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> census = new HashMap<>();
        census.put("Иванов", "Андрей");
        census.put("Петров", "Денис");
        census.put("Сидоров", "Иван");
        census.put("Яковлев", "Сергей");
        census.put("Иванчук", "Петр");
        census.put("Обломов", "Сергей");
        census.put("Печорин", "Александр");
        census.put("Хурганов", "Дамир");
        census.put("Фигов", "Ерем");
        census.put("Яблоков", "Ерополк");

        return census;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> pair = it.next();
            if ( name.equals(pair.getValue())){
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> pair = it.next();
            if ( lastName.equals(pair.getKey())){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {


    }
}
