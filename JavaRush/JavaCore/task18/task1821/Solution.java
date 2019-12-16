package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Character, Integer> arrayMap = new TreeMap<>();
       FileInputStream fileInputStream = new FileInputStream(new File(args[0]));
        while(fileInputStream.available() > 0){
            char key = (char)fileInputStream.read();
            arrayMap.put(key, arrayMap.getOrDefault(key, 0)+1);
         }
        // выводим в консоль. В TreeMap изнчально все должно быть отсортировано по ASCII "из коробки".
        for(Map.Entry<Character, Integer> map : arrayMap.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }
        // закрыли поток
        fileInputStream.close();


    }
}
