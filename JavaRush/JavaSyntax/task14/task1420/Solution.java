package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int a,b;

            a = Integer.parseUnsignedInt(reader.readLine());
            b = Integer.parseUnsignedInt(reader.readLine());
            if(a <= 0 || b <= 0) throw new Exception();
            System.out.println(NOD(Math.abs(a),Math.abs(b)));



    }
    public static int NOD (int a, int b){

        while (a != b){
            if (a > b){
                a -= b;
            }
            else{
                b -= a;
            }
        }
        return a;
    }
}
