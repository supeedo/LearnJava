package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in));
        ArrayList <String> array = new ArrayList<>();
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++){
            array.add(i, reader.readLine());
        }
        for (int i = 0; i < array.size(); i++){
             if (array.get(i).length() < count ){
               count = array.get(i).length() ;
            }
        }
        for (int i = 0; i < array.size(); i++){
            if(array.get(i).length() == count){
                System.out.println(array.get(i));
            }
        }



    }
}
