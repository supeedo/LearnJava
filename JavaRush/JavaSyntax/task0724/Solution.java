package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human humanShasha = new Human("Саша", true, 45  );
        Human humanPetya = new Human("Петя", true, 50);
        Human humanOlya = new Human("Оля", false,40);
        Human humanAnia = new Human("Аня", false, 54);
        Human humanOlesia = new Human("Олеся", false, 25, humanShasha, humanOlya);
        Human humanNatasha = new Human("Наташа", false, 25, humanShasha, humanOlya);
        Human humanAndrey = new Human("Андрей", true, 25, humanShasha, humanOlya);
        Human humanDenis = new Human("Денис", true, 25, humanShasha, humanOlya);
        Human humanOleg = new Human("Олег", true, 25, humanShasha, humanOlya);

        System.out.println(humanShasha);
        System.out.println(humanPetya);
        System.out.println(humanOlya);
        System.out.println(humanAnia);
        System.out.println(humanOlesia);
        System.out.println(humanNatasha);
        System.out.println(humanAndrey);
        System.out.println(humanDenis);
        System.out.println(humanOleg);


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;


        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}