package com.javarush.task.task19.task1904;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter( Scanner fileScanner ) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            SimpleDateFormat inData = new SimpleDateFormat("d M y", Locale.ENGLISH);
               String [] data = fileScanner.nextLine().split(" ", 4);
            Date birdDate = null;
            try {
                birdDate = inData.parse(data[3]);
            } catch (ParseException e) {
                e.printStackTrace();
            }


            return new Person(data[1], data [2], data [0], birdDate) ;
        }

        @Override
        public void close() throws IOException {
          fileScanner.close();
        }
    }
}
