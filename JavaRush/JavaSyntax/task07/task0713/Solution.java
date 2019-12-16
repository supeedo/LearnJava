package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> del3 = new ArrayList<>();
        ArrayList<Integer> del2 = new ArrayList<>();
        ArrayList<Integer> ostatok = new ArrayList<>();
        for ( int i = 0 ; i < 20; i ++){
            list.add(Integer.parseInt(reader.readLine()));
            if (list.get(i) % 3 == 0){
                del3.add(list.get(i));
            }
            if (list.get(i) % 2 == 0){
                del2.add(list.get(i));
            }
            if (list.get(i) % 2 != 0 && list.get(i) % 3 != 0 ){
                ostatok.add(list.get(i));
            }
        }
        printList(del3);
        printList(del2);
        printList(ostatok);
    }

    public static void printList(ArrayList<Integer> list) {
        for ( int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i));
        }
    }
}
