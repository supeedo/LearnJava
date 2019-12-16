package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(Integer m, int n, String value) {
        for (Integer i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Double m, int n, String value) {
        System.out.println(m + n);
        System.out.println(value);
    }
    public static void printMatrix(Double m, double n, String value) {
        System.out.println(m + n);
        System.out.println(value);
    }
    public static void printMatrix(Double m, double n, Object value) {
        System.out.println(m + n);
        System.out.println(value);
    }
    public static void printMatrix(long m, long n, Object value) {
        System.out.println(m + n);
        System.out.println(value);
    }
    public static void printMatrix(long m, int n, String value) {
        System.out.println(m + n);
        System.out.println(value);
    }
    public static void printMatrix(float m, int n, Object value) {
        System.out.println(m + n);
        System.out.println(value);
    }
    public static void printMatrix(long m, Integer n, Object value) {
        System.out.println(m + n);
        System.out.println(value);
    }

}
