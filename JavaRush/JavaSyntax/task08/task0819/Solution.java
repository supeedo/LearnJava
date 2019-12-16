package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> it = cats.iterator();
        cats.remove(it.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cat = new HashSet<Cat>();
        Cat cat1 = new Cat();
        cat.add(cat1);
        Cat cat2 = new Cat();
        cat.add(cat2);
        Cat cat3 = new Cat();
        cat.add(cat3);

        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat:cats) {
            System.out.println(cat);

        }
    }

    // step 1 - пункт 1
    public static class Cat{




    }
}
