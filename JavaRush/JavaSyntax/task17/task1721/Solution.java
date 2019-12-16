package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        //путь к файлам
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        BufferedReader bReaderFile1 = new BufferedReader(new FileReader(new File(file1)));
        BufferedReader bReaderFile2 = new BufferedReader(new FileReader(new File(file2)));
        while (bReaderFile1.ready()) {
            allLines.add(bReaderFile1.readLine());
        }
        while (bReaderFile2.ready()) {
            forRemoveLines.add(bReaderFile2.readLine());
        }
        //закрываем потоки
        bReaderFile1.close();
        bReaderFile2.close();
        reader.close();
        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {
        //работа со строками
        List<String> temp = new ArrayList<String>();
        for (int i = 0; i < forRemoveLines.size(); i++){
            for (int j = 0; j < allLines.size(); j++){
                if(forRemoveLines.get(i).equals(allLines.get(j))){
                      temp.add(allLines.get(j));
                }
            }
        }
        Collections.sort(temp);
        Collections.sort(forRemoveLines);
        if(temp.equals(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }else{
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
