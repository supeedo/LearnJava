package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list = fileReader();
        fileSort(list);
       for(Integer i : list) {
           if (i % 2 == 0)
           System.out.println(i);
       }
    }
    //метод считывания данных из файла
    public static ArrayList<Integer> fileReader(){
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder ss = new StringBuilder();
        BufferedReader reader = null;
        String fileName;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            File file = new File(reader.readLine());
            Scanner scanner = new Scanner(new FileInputStream(file));
            while( scanner.hasNextInt()){
                list.add(scanner.nextInt());
            }
            reader.close();
            scanner.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    // сортировка списка
    public static void fileSort(ArrayList <Integer> list){
        Collections.sort(list);
    }
}
