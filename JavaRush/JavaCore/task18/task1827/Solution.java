package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main( String[] args ) throws Exception {
        final String sp = System.lineSeparator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        String newId = stringValue(String.valueOf(1 + maxIdInFile(fileName)), 8);
        if (args.length != 0 && args[0].equals("-c")) {
            String productName = stringValue(String.format("%.30s", args[1]), 30);
            String price = stringValue(String.format("%.8s", args[2]), 8);
            String quantity = stringValue(String.format("%.4s", args[3]), 4);
            String endString = sp + newId + productName + price + quantity;
            FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
            fileOutputStream.write(endString.getBytes());
            fileOutputStream.close();
        }
    }

    public static int maxIdInFile( String fileName ) throws IOException {
        List<Integer> idList = new ArrayList<>();
        int maxId = 0;
        BufferedReader fReader = new BufferedReader(new FileReader(fileName));
        while (fReader.ready()) {
            String temp = (String.format("%.8s", fReader.readLine())).trim();
            int tempInt = Integer.parseInt(temp);
            idList.add(tempInt);
        }
        fReader.close();
        for (Integer i : idList) {
            if (i > maxId) {
                maxId = i;
            }
        }
        return maxId;
    }

    public static String stringValue( String string, int count ) {
        int diff = count - string.length();
        for (int i = 0; i < diff; i++) {
            string += " ";
        }
        return string;
    }
}
