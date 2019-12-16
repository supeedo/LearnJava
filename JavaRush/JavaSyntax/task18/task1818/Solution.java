package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        File file3 = new File(reader.readLine());
        reader.close();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file1, true));
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream(file2));
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file3));
        while (bufferedInputStream1.available() > 0){
            int a = bufferedInputStream1.read();
            bufferedOutputStream.write(a);
        }
        while (bufferedInputStream2.available() > 0){
            int a = bufferedInputStream2.read();
            bufferedOutputStream.write(a);
        }
        bufferedInputStream1.close();
        bufferedInputStream2.close();
        bufferedOutputStream.close();
    }
}
