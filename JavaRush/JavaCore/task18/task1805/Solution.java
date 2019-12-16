package com.javarush.task.task18.task1805;

import javafx.collections.transformation.SortedList;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        while(fileInputStream.available()>0){
            list.add(fileInputStream.read());
        }
        reader.close();
        fileInputStream.close();
        Collections.sort(list);
        for ( int i = 1; i < list.size(); i++){
            if ( list.get(i).equals(list.get(i-1))){
                list.remove(i-1);
                i--;
            }
        }
        for (Integer a: list) {
            System.out.print(a + " ");
        }

    }
}
