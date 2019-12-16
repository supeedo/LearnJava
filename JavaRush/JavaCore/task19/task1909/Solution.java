package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.awt.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        BufferedReader fReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));
        while(fReader.ready()){
            String s = fReader.readLine().replace(".", "!");
            bufferedWriter.write(s);
            bufferedWriter.flush();
        }
        fReader.close();
        bufferedWriter.close();
    }
}
