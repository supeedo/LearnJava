package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
    } catch (IOException e) {
        e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }
        public static class ReadFileThread extends Thread implements ReadFileInterface{
        String fileName;
        ArrayList<String> list = new ArrayList<>();
        String result = "" ;
        @Override

        public void run() {
            File myFile = new File(fileName);
            try {
                FileReader fReader = new FileReader(myFile);
                BufferedReader reader = new BufferedReader(fReader);
                String line = null;
                while((line = reader.readLine()) != null){
                    list.add(line);
                    //list.add(" ");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e){e.printStackTrace();}
        }


            @Override
            public void setFileName( String fullFileName ) {
               this.fileName = fullFileName;
            }

            @Override
            public String getFileContent() {
                for (int i = 0; i < list.size(); i++) {
                    result = result + " " + list.get(i);
                }
                    return result.trim();


                }
        }

    }
