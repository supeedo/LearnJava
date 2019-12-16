package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int a1 = a - 10;
        if (a1 < 0){
            a1 = abs(a1);
        }
        int b1 = b - 10;
        if (b1 < 0){
            b1 = abs(b1);
        }
        if (a1 < b1){
            System.out.println(a);
        }
        else
            System.out.println(b);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}