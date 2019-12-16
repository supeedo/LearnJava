package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file;
        while (!(file = reader.readLine()).equals("exit")) {
            new ReadThread((file)).start();
        }
        reader.close();


    }

    public static class ReadThread extends Thread {
        FileInputStream fileInputStream;
        String fileName;
        Integer[] arrayByte = MassiveByte();
        int maxCountByte = 0;

        public ReadThread( String fileName ) throws IOException {
            this.fileName = fileName;
            fileInputStream = new FileInputStream(fileName);
        }

        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            try {
                while (fileInputStream.available() > 0) {
                    int a = fileInputStream.read();
                    for (int i = 0; i < arrayByte.length; i++) {
                        if (a == i) {
                            arrayByte[i]++;
                        }
                    }
                }
                fileInputStream.close();
                for (int i = 0; i < arrayByte.length; i++) {
                    if (maxCountByte < arrayByte[i]) {
                        maxCountByte = arrayByte[i];
                    }
                }

                for (int i = 0; i < arrayByte.length; i++) {
                    if (arrayByte[i] == maxCountByte) {
                        resultMap.put(fileName, i);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public Integer[] MassiveByte() {
            Integer[] array = new Integer[256];
            for (int i = 0; i < 256; i++) {
                array[i] = 0;
            }
            return array;
        }
    }
}
