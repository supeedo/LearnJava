package com.javarush.task.task13.task1319;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String>list = new ArrayList<>();
        try{
           File file = new File(reader.readLine());
            while(true){
                String tmp = reader.readLine();
                list.add(tmp);
                if(tmp.equals("exit")){
                    break;
                }

            }
            reader.close();
            FileWriter fl = new FileWriter(file);
           BufferedWriter bw = new BufferedWriter(fl);
           for(String s : list) {
               bw.write(s + "\n");
           }
           bw.close();

        }
        catch(IOException e){}

    }
}
