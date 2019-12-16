package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
        byte [] array1 = new byte[fileInputStream1.available()];
        byte [] array2 = new byte[fileInputStream2.available()];
        while (fileInputStream1.available() > 0) {
            int a = fileInputStream1.read(array1);
        }
        while (fileInputStream2.available() > 0) {
            int a = fileInputStream2.read(array2);
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        fileOutputStream.write(array2);
        fileOutputStream.write(array1);
        reader.close();
        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream.close();

    }
}
