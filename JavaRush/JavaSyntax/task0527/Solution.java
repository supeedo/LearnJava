package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog dogSpike = new Dog("Spike", 10, 20);
        Cat catTom = new Cat("Tom",9,10);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static  class Dog{
        String name = null;
        int strength;
        int height;

        public Dog(String name, int strength, int height){
            this.name = name;
            this.strength = strength;
            this.height = height;
        }
    }
    public static  class Cat{
        String name = null;
        int trick;
        int speed;

        public Cat(String name, int trick, int speed){
            this.name = name;
            this.trick = trick;
            this.speed = speed;
        }
    }
}
