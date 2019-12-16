package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        BufferedReader fReader = new BufferedReader(new FileReader(fileName));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));
        while (fReader.ready()) {
            String[] temp = fReader.readLine().split(" ");
            for (String s : temp) {
                if (isDigit(s)) {
                    bufferedWriter.write(s + " ");
                    bufferedWriter.flush();
                }
            }
        }
        fReader.close();
        bufferedWriter.close();
    }

    public static boolean isDigit( String s ) {
        if (s.isEmpty()) {
            return false;
        }
        for (Character c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
