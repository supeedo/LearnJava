package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main( String[] args ) throws IOException {
        String tag = args[0];
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();
        consoleReader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        while (fileReader.ready()) {
            sb.append(fileReader.readLine());
        }
        fileReader.close();
        Document doc = Jsoup.parse(sb.toString(), "", Parser.xmlParser());
        Elements elements = doc.getElementsByTag(tag);
        for (Element el : elements){
            System.out.println(el.toString());
        }
    }
}
