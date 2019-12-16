package com.javarush.task.task19.task1916;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileName2));
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();

        while (bufferedReader1.ready()) {
            a.add(bufferedReader1.readLine());
        }
        bufferedReader1.close();
        while (bufferedReader2.ready()) {
            b.add(bufferedReader2.readLine());
        }
        bufferedReader2.close();

        int n = a.size() > b.size() ? a.size() : b.size();

        while (a.size() != 0 && b.size() != 0) {
            if (a.get(0).equals(b.get(0))) {
                lines.add(new LineItem(Type.SAME, a.get(0)));
                a.remove(0);
                b.remove(0);
            }
            else if (b.size() != 1 && a.get(0).equals(b.get(1))){
                lines.add(new LineItem(Type.ADDED, b.get(0)));
                b.remove(0);
            }
            else if (a.size() != 1 && a.get(1).equals(b.get(0))){
                lines.add(new LineItem(Type.REMOVED, a.get(0)));
                a.remove(0);
            }
        }
        if (a.size() != 0) {
            lines.add(new LineItem(Type.REMOVED, a.get(0)));
            a.remove(0);
        } else if (b.size() != 0) {
            lines.add(new LineItem(Type.ADDED, b.get(0)));
            b.remove(0);
        }


        for (LineItem lineItem : lines) {
            System.out.println(lineItem.type);
        }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem( Type type, String line ) {
            this.type = type;
            this.line = line;
        }
    }
}
