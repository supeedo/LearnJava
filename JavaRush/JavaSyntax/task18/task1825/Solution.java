package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main( String[] args ) throws IOException {
        String[] fileName = new String[50];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tempFile;
        int index;
        String newFile = null;
        while (true) {
            tempFile = reader.readLine();
            if (tempFile.equals("end")) {
                break;
            }
            String[] tempArray = tempFile.split(".part");
            newFile = tempArray[0];
            index = Integer.parseInt(tempArray[1]);
            fileName[index] = tempFile;
        }
        for (int i = 0; i < fileName.length; i++) {
            if (fileName[i] != null) {
                BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(fileName[i]));
                BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(newFile, true));
                while (fileInputStream.available() > 0) {
                    int temp = fileInputStream.read();
                    fileOutputStream.write(temp);
                }
                fileInputStream.close();
                fileOutputStream.close();
            }
        }
        reader.close();
    }
}
