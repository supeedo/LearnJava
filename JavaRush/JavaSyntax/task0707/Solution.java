package com.javarush.task.task07.task0707;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("строчка1");
        array.add("строчка2");
        array.add("строчка3");
        array.add("строчка4");
        array.add("строчка5");
        System.out.println(array.size());
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
}
