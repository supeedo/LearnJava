package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set <String> list = new HashSet<>();
        list.add("арбуз");
        list.add("банан");
        list.add("вишня");
        list.add("груша");
        list.add("дыня");
        list.add("ежевика");
        list.add("женьшень");
        list.add("земляника");
        list.add("ирис");
        list.add("картофель");

        for(String text : list){
            System.out.println(text);
        }

    }
}
