package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int thisCat = 0;
        int anCat = 0;
        if (this.age > anotherCat.age){
            thisCat++;
        }
        else if (this.age != anotherCat.age) {
            anCat++;
        }

        if (this.weight > anotherCat.weight){
            thisCat++;
        }
        else if (this.weight != anotherCat.weight){
            anCat++;
        }
        if (this.strength > anotherCat.strength){
            thisCat++;
        }

        else if(this.strength != anotherCat.strength){
            anCat++;
        }

        if (thisCat >  anCat){
            return true;
        }
        if (thisCat == anCat)
            return false;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
