package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws  IOException {
        int count = 0;
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        while (fileInputStream.available()>0){
            int a = fileInputStream.read();
            if(a > 64 && a < 91 || a > 96 && a < 123){
                count++;
            }
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
