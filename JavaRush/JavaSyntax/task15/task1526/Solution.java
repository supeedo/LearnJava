package com.javarush.task.task15.task1526;

/* 
Дебаг, дебаг, и еще раз дебаг
*/

public class Solution {
    public static void main(String[] args) {

        new B(6);  //создание объекта класса Б с инициализацией цифрой 6

    }

    public static class A {   //класс А
        private int f1 = 7; //поле Ф1 класса А, инициализированное числом 7

        public A(int f1) {
            this.f1 = f1;
            initialize();
        }

        private void initialize() {

            System.out.println(f1);
        }
    }

    public static class B extends A {  //класс Б наследованный от А
        protected int f1 = 3;  //поле Ф1 класса Б, инициализированное числом 3

        public B(int f1) {  //конструктор ккласса Б
            super(f1);  //обращение к переменной родительского класса
            this.f1 += f1;  // к цифре 6 (инициализация нового объекта, прибалено 3 из поля класса Б
            initialize();  //вызов метода печати
        }

        protected void initialize() {
            System.out.println(f1);  //печатаем 9
        }
    }
}
