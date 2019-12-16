package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Struct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main( String[] args ) throws IOException, ParseException {
        SimpleDateFormat inData = new SimpleDateFormat("d M y", Locale.ENGLISH);
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while (reader.ready()) {
            String[] temp = reader.readLine().split(" ");
            int tLength = temp.length;
            StringBuilder stringDate = new StringBuilder();
            StringBuilder stringName = new StringBuilder();
            stringDate.append(temp[tLength - 3]).append(" ").append(temp[tLength - 2]).append(" ").append(temp[tLength - 1]);
            Date bDate = inData.parse(stringDate.toString());
            if (tLength == 6) {
                stringName.append(temp[tLength - 6]).append(" ").append(temp[tLength - 5]).append(" ").append(temp[tLength - 4]);
            } else if (tLength == 5) {
                stringName.append(temp[tLength - 5]).append(" ").append(temp[tLength - 4]);
            } else if (tLength == 4) {
                stringName.append(temp[tLength - 4]);
            }
            PEOPLE.add(new Person(stringName.toString(), bDate));
        }
        reader.close();

    }
}
