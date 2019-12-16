package com.javarush.task.task14.task1419;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        //1
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        //2
        try {
            throw new ArrayIndexOutOfBoundsException();

        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        //3
        try {
            throw new ArrayStoreException();

        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
        //4
        try {
            throw new ClassCastException();

        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        //5
        try {
            throw new IllegalAccessException();

        } catch (IllegalAccessException e) {
            exceptions.add(e);
        }
        //6
        try {
            throw new IllegalArgumentException();

        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }
        //7
        try {
            throw new IndexOutOfBoundsException();

        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        //8
        try {
            throw new NegativeArraySizeException();

        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
        //9
        try {
            throw new NullPointerException();

        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        //10
        try {
            throw new NumberFormatException();

        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

    }
}
