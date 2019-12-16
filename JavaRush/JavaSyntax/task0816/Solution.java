package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Яковлев", dateFormat.parse("October 3 1982"));
        map.put("Петров", dateFormat.parse("October 8 1992"));
        map.put("Сидоров", dateFormat.parse("June 1 1995"));
        map.put("Иванов", dateFormat.parse("July 15 2012"));
        map.put("Максимов", dateFormat.parse("MAY 1 2012"));
        map.put("Обловом", dateFormat.parse("MAY 1 2012"));
        map.put("Васин", dateFormat.parse("July 2 1981"));
        map.put("Московин", dateFormat.parse("February 1 2012"));
        map.put("Марьин", dateFormat.parse("January 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Date> pair = it.next();
             Integer month = pair.getValue().getMonth();
            if( month.equals(5) || month.equals(6)|| month.equals(7)){
                it.remove();
            }
        }

    }

    public static void main(String[] args) {



    }
}
