package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(file2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
      //  int [] array = new int [fileInputStream.available()];
        int a = fileInputStream.available();
        int b =( a / 2) + (a % 2);
       // int c = a - b;
        while(fileInputStream.available() > 0){
            for ( int i = 0; i < a; i++){
                if (i <b){
                    fileOutputStream1.write(fileInputStream.read());
                }
                else if ( i >=b){
                    fileOutputStream2.write(fileInputStream.read());
                }
            }
        }
        reader.close();
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();

    }
}
