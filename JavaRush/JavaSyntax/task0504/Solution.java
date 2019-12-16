package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat catVaska = new Cat("Vaska", 3,3,5);
        Cat catBarsik = new Cat("Barsik",4, 4,6);
        Cat catMursik = new Cat("Mursik", 12,8, 9);


    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}