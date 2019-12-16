package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();
        Map<String, Integer> pattern = new HashMap<>();
        pattern.put("January", 1);
        pattern.put("February", 2);
        pattern.put("March", 3);
        pattern.put("April", 4);
        pattern.put("May", 5);
        pattern.put("June", 6);
        pattern.put("July", 7);
        pattern.put("August", 8);
        pattern.put("September", 9);
        pattern.put("October", 10);
        pattern.put("November", 11);
        pattern.put("December", 12);
       Iterator<Map.Entry<String, Integer>>it = pattern.entrySet().iterator();
       while(it.hasNext()){
           Map.Entry<String, Integer> pair = it.next();
           if (date.equals(pair.getKey())){
               Integer number = pair.getValue();
               System.out.println(date +" is the "+ number+ " month");
           }
       }





    }
}
