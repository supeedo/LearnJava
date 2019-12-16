package com.javarush.task.task17.task1711;

import org.w3c.dom.css.CSSImportRule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1

    }

    public static void main(String[] args) {

        //  идиотизм для валидатора

            switch (args[0]) {

                case "-c":
                    synchronized (allPeople) {
                        addPeople(args);
                        break;
                    }
                case "-u":
                    synchronized (allPeople) {
                        updatePeople(args);
                        break;
                    }
                case "-d":
                    synchronized (allPeople) {
                        nullPeople(args);
                        break;
                    }
                case "-i":
                    synchronized (allPeople) {
                        printPeople(args);
                        break;
                    }
            }


 }
   //  создание людей
    public static void addPeople (String[]array)  {
        SimpleDateFormat inData = new SimpleDateFormat("dd/MM/yyyy");
        Person person;
        try{
           for (int i = 2; i < array.length;i+=3){
            if(array[i].equals("м")) {
                 person = Person.createMale(array[i-1],inData.parse(array[i+1]));
            }
            else {
                 person = Person.createFemale(array[i-1],inData.parse(array[i+1]));
            }
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
            }
        } catch (ParseException e) {
        e.printStackTrace();
        }
    }
   // обновление людей
    public static void updatePeople (String[]array)  {
        SimpleDateFormat inData = new SimpleDateFormat("dd/MM/yyyy");
        Person person;
        try{
            for (int i = 1; i < array.length; i+=4){
                if(array[i+2].equals("м")) {
                    person = Person.createMale(array[i+1],inData.parse(array[i+3]));
                }
                else {
                    person = Person.createFemale(array[i-1],inData.parse(array[i+3]));
                }
               allPeople.set(Integer.parseInt(array[i]), person);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    //обнуление данных
    public static void nullPeople (String[]array) {
        for (int i = 1; i < array.length; i++) {
            allPeople.get(Integer.parseInt(array[i])).setName(null);
            allPeople.get(Integer.parseInt(array[i])).setSex(null);
            allPeople.get(Integer.parseInt(array[i])).setBirthDate(null);
        }

    }
  //печать данных
    public static void printPeople (String[]array) {
        SimpleDateFormat outData = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
        for (int i = 1; i < array.length; i++) {
             String name = allPeople.get(Integer.parseInt(array[i])).getName();
            Sex sex = allPeople.get(Integer.parseInt(array[i])).getSex();
           String date =  outData.format(allPeople.get(Integer.parseInt(array[i])).getBirthDate());
             if(sex == Sex.MALE) {
                 System.out.println(name + " " + "м" + " " + date);
             }else {
                 System.out.println(name + " " + "ж" + " " + date);
             }
        }
    }

}
