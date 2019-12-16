package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name = null;
    int age;
    int weight;
    String address = null;
    String color = null;

    public Cat(String name){
        this.name = name;
        this.age = 2;
        this.weight = 2;
        this.color = "White";
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "White";
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "White";
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 2;

    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 2;
    }

    public static void main(String[] args) {

    }
}
