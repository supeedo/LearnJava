package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tmp;
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        while (a > b || b > c || c > d || d > e) {
            if (a > b) {
                tmp = a;
                a = b;
                b = tmp;
            }
            if (b > c) {
                tmp = b;
                b = c;
                c = tmp;
            }
            if (c > d) {
                tmp = c;
                c = d;
                d = tmp;
            }
            if (d > e) {
                tmp = d;
                d = e;
                e = tmp;
            }

        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}