package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List <Integer> number = new ArrayList<>();
        int count = 1;
        int countDef = 1;
        for (int i = 0; i < 10; i++ ){
            number.add(Integer.parseInt(reader.readLine()));
        }

        for ( int i = 1; i < number.size(); i++){
           if (number.get(i).equals(number.get(i-1))){
               count++;
            }
           else{
               count = 1;
           }
           if (countDef < count){
               countDef = count;
           }

        }
        System.out.println(countDef);

    }
}