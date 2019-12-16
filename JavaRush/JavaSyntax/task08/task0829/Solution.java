package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List <String> family = new ArrayList<>();
        while (true){
            String string = reader.readLine();
            if(string.isEmpty()){
                break;
            }
            family.add(string);
        }
        String city = reader.readLine();
        for (int i = 0; i < family.size(); i++){
            if (family.get(i).equals(city)){
                System.out.println(family.get(i+1));
            }
        }

    }
}
