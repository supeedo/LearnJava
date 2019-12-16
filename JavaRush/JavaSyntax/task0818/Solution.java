package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map <String, Integer> firma =  new HashMap<>();
        firma.put("Иванов", 100);
        firma.put("Петров", 150);
        firma.put("Сидоров", 200);
        firma.put("Яковлев", 250);
        firma.put("Васин", 300);
        firma.put("Денисов", 350);
        firma.put("Толиков", 400);
        firma.put("Собакевич", 450);
        firma.put("Обломов", 500);
        firma.put("Сидорчук", 550);
        return firma;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> pair = it.next();
            if ( pair.getValue() < 500){
               it.remove();
            }
        }



    }
    public static void main(String[] args) {
         Map <String, Integer> otchet = createMap();
         removeItemFromMap(otchet);
         Iterator<Map.Entry<String, Integer>> it = otchet.entrySet().iterator();
         while (it.hasNext()){
             Map.Entry<String, Integer> pair = it.next();
             String key = pair.getKey();
             Integer value = pair.getValue();
             System.out.println(key + " " + value);
         }


    }
}