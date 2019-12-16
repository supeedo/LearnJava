package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args)  {

        readData();
    }


    public static void readData()  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> num = new ArrayList<>();
        try {
            while(true){
                int a = Integer.parseInt(reader.readLine());
                num.add(a);
            }
        }
        catch (IOException e){

        }
        catch(NumberFormatException e){
            for (int i = 0; i < num.size(); i++) {
                System.out.println(num.get(i));
            }
        }
    }
}
