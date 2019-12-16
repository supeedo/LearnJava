package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringDate = reader.readLine();
        SimpleDateFormat oldFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat newFormat = new SimpleDateFormat("MMM d, YYYY", Locale.ENGLISH);

        Date date = oldFormat.parse(stringDate);
        String result = newFormat.format(date).toUpperCase();
        System.out.println(result);

    }
}
