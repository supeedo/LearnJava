package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String file = reader.readLine();
    FileInputStream inStream = new FileInputStream(file);

    while(inStream.available() > 0) {
        System.out.print((char) inStream.read());
    }
            inStream.close();
            reader.close();
}
    catch (FileNotFoundException e){

    }
    }
}