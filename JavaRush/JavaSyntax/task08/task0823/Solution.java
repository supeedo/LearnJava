package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Омовение Рамы
*/

public class Solution {
    public Solution() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine().trim();
        while (string.contains("  ")){
            String replace = string.replace("  ", " ");
            string = replace;
        }
        String [] s = new String (string).split(" ");
         for (int i = 0; i < s.length; i++){
            s[i]= s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
        }
        for (int i = 0 ; i < s.length; i++){
            System.out.print(s[i] + " ");
        }

    }
}
