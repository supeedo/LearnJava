package com.javarush.task.task08.task0817;

import java.util.*;


/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов","Иван");
        map.put("Петров","Петр");
        map.put("Сидоров","Сергей");
        map.put("Васин","Денис");
        map.put("Васечкин","Евгений");
        map.put("Яковлев","Сергей");
        map.put("Моисеев","Андрей");
        map.put("Обломов","Олег");
        map.put("Тиньков","Олег");
        map.put("Новгородов","Игнат");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> copy = new ArrayList<>();
        Iterator < Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> pair = it.next();
            copy.add(pair.getValue());
        }
        for ( int i = 0; i < copy.size(); i++){
            for (int j = 0; j < copy.size(); j++){
                if (copy.get(i).equals(copy.get(j)) && i != j){
                    removeItemFromMapByValue(map, copy.get(j));
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {


    }
}
