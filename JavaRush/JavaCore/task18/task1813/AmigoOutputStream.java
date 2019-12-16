package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    FileOutputStream component;
    public static String fileName = "C:/tmp/result.txt";

    public AmigoOutputStream(FileOutputStream component) throws FileNotFoundException {
        super("AmigoOutputStream");
        this.component = component;
    }
    public void flush() throws IOException {
        component.flush();
    }
    public void write(int b) throws IOException {
        component.write(b);
    }
    public void write(byte[] b) throws IOException {
        component.write(b);
    }
    public void write(byte[] b, int off, int len) throws IOException {
        component.write(b, off, len);
    }

    public void close() throws IOException {
        String s = "JavaRush © All rights reserved.";
        byte [] ss = s.getBytes();
        component.flush();
        component.write(ss);
        component.close();
    }

    public AmigoOutputStream( String name ) throws FileNotFoundException {
        super(name);
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
