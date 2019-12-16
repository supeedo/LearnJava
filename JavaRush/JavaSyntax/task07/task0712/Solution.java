package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        ArrayList <String> array = new ArrayList<>();
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < 10; i++){
            array.add(i, reader.readLine());
            if (array.get(i).length() > max){
                max = array.get(i).length();
            }
            if (array.get(i).length() < min){
                min = array.get(i).length();
            }
        }
        for (int i = 0 ; i < array.size(); i++){
            if (array.get(i).length() == max){
                System.out.println(array.get(i));
                break;
            }
            if (array.get(i).length() == min){
                System.out.println(array.get(i));
                break;
            }
        }
    }
}
