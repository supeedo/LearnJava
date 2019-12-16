package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {

    public static Map<Double, String> labels = new HashMap<Double, String>();
    static{
        labels.put( 12.1, "aaa");
        labels.put( 12.2, "aab");
        labels.put( 12.3, "aac");
        labels.put( 12.4, "aad");
        labels.put( 12.5, "aae");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
