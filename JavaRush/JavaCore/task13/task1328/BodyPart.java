package com.javarush.task.task13.task1328;

//финальный класс ЧастиТела робота
public final class BodyPart {
    final static BodyPart LEG = new BodyPart("нога");  //объект нога
    final static BodyPart HEAD = new BodyPart("голова"); //объект голова
    final static BodyPart ARM = new BodyPart("рука"); //объект рука
    final static BodyPart CHEST = new BodyPart("грудь");

    private String bodyPart; //переменная части тела

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}
