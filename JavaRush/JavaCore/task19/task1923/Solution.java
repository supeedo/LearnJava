package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {
    public static void main( String[] args ) throws IOException {
        Pattern pattern = Pattern.compile("\\d+");
        BufferedReader fReader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);
        while (fReader.ready()) {
            String[] temp = fReader.readLine().split(" ");
            for (String s : temp) {
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()) {
                    fileWriter.write(s + " ");
                    fileWriter.flush();
                }
            }
        }
        fReader.close();
        fileWriter.close();
    }
}
