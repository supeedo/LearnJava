package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map <String, String> list = new HashMap<>();
        list.put("арбуз","ягода");
        list.put("банан","трава");
        list.put("вишня","ягода");
        list.put("груша","фрукт");
        list.put("дыня","овощ");
        list.put("ежевика","куст");
        list.put("жень-шень","корень");
        list.put("земляника","ягода");
        list.put("ирис","цветок");
        list.put("картофель","клубень");
        for(Map.Entry<String, String> text : list.entrySet()){
            String key = text.getKey();
            String value = text.getValue();
            System.out.println(key + " - " + value);
        }

    }
}
