package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        ArrayList<Character> charsA = new ArrayList<>();
        ArrayList<Character> charsB = new ArrayList<>();
        char[] stringToChar = string.replaceAll("\\s", "").toCharArray();
        for(int i = 0; i < stringToChar.length; i++){
            if(isVowel(stringToChar[i]) == true){
                charsA.add(stringToChar[i]);
            }
            else{
                charsB.add(stringToChar[i]);
            }

        }
        for (int i = 0; i < charsA.size() ; i++ ) {
            System.out.print(charsA.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < charsB.size() ; i++ ) {
            System.out.print(charsB.get(i) + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}