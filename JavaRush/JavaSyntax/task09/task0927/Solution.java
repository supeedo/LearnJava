package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map <String, Cat> cat = new HashMap<>();
        Cat cat1 = new Cat("Name1");
        Cat cat2 = new Cat("Name2");
        Cat cat3 = new Cat("Name3");
        Cat cat4 = new Cat("Name4");
        Cat cat5 = new Cat("Name5");
        Cat cat6 = new Cat("Name6");
        Cat cat7 = new Cat("Name7");
        Cat cat8 = new Cat("Name8");
        Cat cat9 = new Cat("Name9");
        Cat cat10 = new Cat("Name10");
        cat.put("Name1", cat1);
        cat.put("Name2", cat2);
        cat.put("Name3", cat3);
        cat.put("Name4", cat4);
        cat.put("Name5", cat5);
        cat.put("Name6", cat6);
        cat.put("Name7", cat7);
        cat.put("Name8", cat8);
        cat.put("Name9", cat9);
        cat.put("Name10", cat10);
        return cat;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> cat = new HashSet<>(map.values());
        return cat;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {

            this.name = name;
        }

        public String toString() {

            return "Cat " + this.name;
        }
    }


}
