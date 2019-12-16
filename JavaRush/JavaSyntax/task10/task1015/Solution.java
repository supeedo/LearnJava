package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> array[] = new ArrayList[2];
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("test1");
        list1.add("test2");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("test3");
        list2.add("test4");
        array[0] = list1;
        array[1] = list2;
        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}