package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        int length = array.length;
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> string = new ArrayList<>();

        for (int i = 0; i < array.length; i++){
            if(isNumber(array[i]) == true){
                num.add(Integer.parseInt(array[i]));
            }
            else{
                string.add(array[i]);
            }
        }
        String a = "null", b = "null";
        isGreaterThan(a, b);
        Collections.sort(string);
        Collections.sort(num);
        Collections.reverse(num);
        for (int i = 0; i < length; i++){
           if(i <= string.size()-1) {
               array[i] = string.get(i);
           }
           else{
               array[i] = num.get(i-string.size()).toString();
           }
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {

        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
