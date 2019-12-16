package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String granddadName = reader.readLine();
        Cat catGranddad = new Cat(granddadName,null,null);

        String grandmumName = reader.readLine();
        Cat catGrandmum = new Cat(grandmumName,null,null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGranddad);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmum, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGranddad);
        System.out.println(catGrandmum);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }


        Cat (String name, Cat mother, Cat father){
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null) {
                if (father == null) {
                    return "The cat's name is " + name + ", no mother " + ", no father";
                } else {
                    return "The cat's name is " + name + ", no mother " + ", father is " + father.name;
                }
            }
            if (father == null) {
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            } else {
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            }
        }
    }

}
