package com.javarush.task.task15.task1530;

public abstract class DrinkMaker {

    abstract void getRightCup();//выбрать чашку
    abstract void putIngredient(); //положить ингридиенты
    abstract void pour(); //залить жидкостью

    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }


}
