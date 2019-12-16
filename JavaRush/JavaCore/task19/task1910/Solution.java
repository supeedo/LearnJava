package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        BufferedReader fReader = new BufferedReader(new FileReader(fileName));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));
        while( fReader.ready()){
        String s = fReader.readLine().replaceAll("[\\pP]", "");
        bufferedWriter.write(s);
        bufferedWriter.flush();
        }
        fReader.close();
        bufferedWriter.close();
    }
}
