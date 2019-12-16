package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(Date.parse(date));
        SimpleDateFormat day = new SimpleDateFormat("D");
        int n = Integer.parseInt(day.format(date1));

        if (n % 2 == 0){
            return false;
        }
        else {
            return true;
        }
    }
}
