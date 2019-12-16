package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fReader = new BufferedReader(new FileReader(fileName));
        while (fReader.ready()) {
            int count = 0;
            String sTemp = fReader.readLine();
            String[] temp = sTemp.split(" ");
            for (int i = 0; i < words.size(); i++) {
                for (int j = 0; j < temp.length; j++) {
                    if (words.get(i).equals(temp[j])) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                System.out.println(sTemp);
            }
        }
        fReader.close();
    }
}
