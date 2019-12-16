package com.javarush.task.task13.task1328;

//класс робот наследованный от АбстрактРобот
public class Robot extends AbstractRobot {
    private String name;

    //метод установки имени
    public Robot(String name) {
        this.name = name;
    }

    //геттер имени класса Робот
    public String getName() {
        return name;
    }



}
