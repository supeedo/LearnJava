package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> family = new ArrayList<>();
        ArrayList<Human> pokolenie0 = new ArrayList<>();
        ArrayList<Human> pokolenie1 = new ArrayList<>();
        ArrayList<Human> pokolenie2a = new ArrayList<>();
        ArrayList<Human> pokolenie2b = new ArrayList<>();
        ArrayList<Human> pokolenie3 = new ArrayList<>();

        Human children1 = new Human("Ребенок1", true, 15, pokolenie0 );
        Human children2 = new Human("Ребенок2", true, 17, pokolenie0 );
        Human children3 = new Human("Ребенок3", false, 6, pokolenie0 );
        pokolenie3.add(children1);
        pokolenie3.add(children2);
        pokolenie3.add(children3);

        Human father = new Human("Отец", true, 36, pokolenie3);
        pokolenie2a.add(father);
        Human mother = new Human("Мать", false, 32, pokolenie3);
        pokolenie2b.add(mother);
        Human grandMo1 = new Human("Бабушка1", false, 65, pokolenie2a);
        Human grandMo2 = new Human("Бабушка2", false, 62, pokolenie2b);
        Human grandFa1 = new Human("Дедушка1", true, 68, pokolenie2a);
        Human grandFa2 = new Human("Дедушка2", true, 72, pokolenie2b);
        pokolenie1.add(grandFa1);
        pokolenie1.add(grandFa2);
        pokolenie1.add(grandMo1);
        pokolenie1.add(grandMo2);
        family.addAll(pokolenie1);
        family.addAll(pokolenie2a);
        family.addAll(pokolenie2b);
        family.addAll(pokolenie3);
        for (Human hum : family) {


            System.out.println(hum);
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList <Human> children;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
