package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import org.w3c.dom.ls.LSOutput;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main( String[] args ) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);
        String[] array = result.split(" ");
        if (array[1].equals("+")) {
            int a = Integer.parseInt(array[0]) + Integer.parseInt(array[2]);
            System.out.printf("%s + %s = %d", array[0], array[2], a);
        }
        else if (array[1].equals("-")) {
            int a = Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
            System.out.printf("%s - %s = %d", array[0], array[2], a);
        }
        else if (array[1].equals("/")) {
            int a = Integer.parseInt(array[0]) / Integer.parseInt(array[2]);
            System.out.printf("%s / %s = %d", array[0], array[2], a);
        }
        else if (array[1].equals("*")) {
            int a = Integer.parseInt(array[0]) * Integer.parseInt(array[2]);
            System.out.printf("%s * %s = %d", array[0], array[2], a);
        }


    }


    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }

}

