package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> arrayMap = new TreeMap<>();
        Double maxCash = 0.0;
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while(reader.ready()){
            String [] temp = reader.readLine().split(" ");
            if(arrayMap.get(temp[0]) == null){
                arrayMap.put(temp[0], Double.parseDouble(temp[1]));
                if ( arrayMap.get(temp[0]) > maxCash){maxCash = arrayMap.get(temp[0]);}
            }
            else {
                arrayMap.put(temp[0], arrayMap.get(temp[0])+ Double.parseDouble(temp[1]));
                if ( arrayMap.get(temp[0]) > maxCash){maxCash = arrayMap.get(temp[0]);}
            }
        }
        reader.close();
        for(Map.Entry<String, Double> s : arrayMap.entrySet()){
            if ( s.getValue().equals(maxCash)){
                System.out.println(s.getKey());}
        }
    }
}
