package com.javarush.task.task13.task1328;

//абстрактный класс робота
public abstract class AbstractRobot implements Attackable, Defensable {
    private static int hitCount;
    private String name;

    //реализация атаки
    public BodyPart attack() {
        BodyPart attackedBodyPart = null; //создание переменной attackedBodyPart с индексацией null
        hitCount = (int)(Math.random()* +4)+1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
             attackedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4){
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }

        return attackedBodyPart;
    }

    //реализация защиты
    public BodyPart defense() {
        BodyPart defendedBodyPart = null; //создание переменной defendedBodyPart с индексацией null
        hitCount = (int)(Math.random()* +4)+1;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            hitCount = 0;
            defendedBodyPart = BodyPart.ARM;
        } else if (hitCount == 4){
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }

     //геттер имени
    public String getName() {
        return name;
    }
}
