package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        while (true) {
            fileName = reader.readLine();
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            } catch (IOException e) {
                System.out.println(fileName);
                break;
            }
        }
        reader.close();
    }
}
