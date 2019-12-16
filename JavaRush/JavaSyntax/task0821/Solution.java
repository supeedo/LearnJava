package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов","Андрей");
        map.put("Петров","Сергей");
        map.put("Сидоров","Денис");
        map.put("Васечкин","Александр");
        map.put("Яковлев","Алексей");
        map.put("Обломов","Азамат");
        map.put("Тиньков","Кирилл");
        map.put("Иванов","Олег");
        map.put("Метров","Мустаф");
        map.put("Сидорович","Денис");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
