package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        String[] listArray = null;
        BufferedReader fReader = new BufferedReader(new FileReader(file));
        while (fReader.ready()) {
            listArray = fReader.readLine().split("\\p{P}?[ \\t\\n\\r]+");
        }
        fReader.close();
        System.out.println(listArray.length);
    }
}
