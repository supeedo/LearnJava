package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = new ArrayList<>(Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я'));

        // Ввод строк
        List<Integer> countLetter = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine().toLowerCase();
            sb.append(s);
        }
        //переводим строки в массив знаков
        String[] arrayList = sb.toString().split("");

        // сравниваем знаки с алфавитом
        for (int i = 0; i < alphabet.size(); i++){
            Integer count = 0;
            for(int j = 0; j < arrayList.length; j++){
                if (alphabet.get(i).toString().equals(arrayList[j])){
                    count++;
                }
            }
            countLetter.add(count);
        }
        //выводим в консоль
        for (int i = 0; i < alphabet.size(); i++){
            System.out.println(alphabet.get(i) + " " + countLetter.get(i));
        }

    }
}
