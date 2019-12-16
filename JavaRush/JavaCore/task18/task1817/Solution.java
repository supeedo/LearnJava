package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
       double countAll = 0;
       double countSpace = 0;
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        while (fileInputStream.available() > 0){
            int a = fileInputStream.read();
            if (a == 32){countSpace++;}
            countAll++;
        }
        fileInputStream.close();
        System.out.printf("%.2f",(countSpace/countAll)*100);
    }
}
