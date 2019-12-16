package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main( String[] args ) throws IOException {
        final String sl = System.lineSeparator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        if (args.length > 0 && args[0].equals("-u")) {
            String id = valueOfString(String.format("%.8s", args[1]), 8);
            String productName = valueOfString(String.format("%.30s", args[2]), 30);
            String price = valueOfString(String.format("%.8s", args[3]), 8);
            String quantity = valueOfString(String.format("%.4s", args[4]), 4);
            String finalString = id + productName + price + quantity + sl;
            setStringInFile(fileName, id, finalString);

        } else if (args.length > 0 && args[0].equals("-d")) {
            String id = valueOfString(String.format("%.8s", args[1]), 8);
            deleteFromFile(fileName, id);
        }
    }

    public static String valueOfString( String string, int value ) {
        int count = value - string.length();
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                string += " ";
            }
        }
        return string;
    }

    public static void setStringInFile( String fileName, String id, String string ) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader fReader = new BufferedReader(new FileReader(fileName));
        while (fReader.ready()) {
            list.add(fReader.readLine() + System.lineSeparator());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith(id)) {
                list.set(i, string);
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        for (String s : list) {
            fileOutputStream.write(s.getBytes());
        }
        fReader.close();
        fileOutputStream.close();
    }

    public static void deleteFromFile( String fileName, String id ) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader fReader = new BufferedReader(new FileReader(fileName));
        while (fReader.ready()) {
            list.add(fReader.readLine() + System.lineSeparator());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith(id)) {
                list.remove(i);
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        for (String s : list) {
            fileOutputStream.write(s.getBytes());
        }
        fReader.close();
        fileOutputStream.close();
    }
}
