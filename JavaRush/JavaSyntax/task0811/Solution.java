package com.javarush.task.task08.task0811;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
*/

public class Solution {
    public static List getListForGet() {
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            list.get(i);
        }
        return list;

    }

    public static List getListForSet() {
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            list.set(i,i);
        }
        return list;

    }

    public static List getListForAddOrInsert() {
        LinkedList<Object> list = new LinkedList<>();
        for (int i = 0; i < list.size(); i++){
            list.add(i);
        }
        return list;

    }

    public static List getListForRemove() {
        LinkedList<Object> list = new LinkedList<>();
        for (int i = 0; i < list.size(); i++){
            list.remove(i);
        }
        return list;

    }

    public static void main(String[] args) {

    }
}
