package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileA = reader.readLine();
        String fileB = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(fileA);
        FileWriter fileWriter = new FileWriter(fileB);
        char [] tempChar = new char[2];
        while (fileReader.ready()){
            fileReader.read(tempChar);
            fileWriter.write(tempChar[1]);
            fileWriter.flush();
        }
        fileReader.close();
        fileWriter.close();
    }
}
