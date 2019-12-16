package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Solution {
    public static void main( String[] args ) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(args[1]);
        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            String[] temp = reader.readLine().split(",| ");
            for (String s : temp) {
                s.trim();
                if (s.length() > 6) {
                    sb.append(s).append(",");
                }
            }
        }
        sb.setLength(sb.length() - 1);
        fileReader.close();
        reader.close();

        fileWriter.write(sb.toString());
        fileWriter.close();
    }
}
