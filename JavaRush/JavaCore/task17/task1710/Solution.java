package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        //start here - начни тут
        SimpleDateFormat inFormat =  new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

            if(args[0].equals("-c")){
                if (args[2].equals("м")) {
                  Person person = Person.createMale(args[1], inFormat.parse(args[3]) );
                   allPeople.add(person);
                    System.out.println(allPeople.indexOf(person));
                }
                if (args[2].equals("ж")) {
                   Person person = Person.createFemale(args[1], inFormat.parse(args[3]) );
                   allPeople.add(person);
                    System.out.println(allPeople.indexOf(person));
                }
            }
            if(args[0].equals("-u")){
                Person person;
                if (args[3].equals("м")) {
                    person = Person.createMale(args[2], inFormat.parse(args[4]));
                }
                else {
                    person = Person.createFemale(args[2], inFormat.parse(args[4]));
                }
                allPeople.remove(Integer.parseInt(args[1]));
                allPeople.add(Integer.parseInt(args[1]), person);
            }
            if(args[0].equals("-d")){
                allPeople.get(Integer.parseInt(args[1])).setName(null);
                allPeople.get(Integer.parseInt(args[1])).setSex(null);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
            }
            if(args[0].equals("-i")){
               String name = allPeople.get(Integer.parseInt(args[1])).getName();
               Sex sex = allPeople.get(Integer.parseInt(args[1])).getSex();
               String date = outFormat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate());

                if(sex == Sex.MALE) {
                    System.out.println(name + " " + "м" + " " + date);
                }
                else System.out.println(name + " " + "ж" + " " + date);
            }










    }
    public static void AddPeople (Person person){

    }
}
