package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
       private String name;
       private int age;
       private boolean sex;
       private String address;
       private boolean work;
       private boolean married;

        public Human(){

       }
        public Human(String name){
          this.name = name;
        }
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, int age, boolean sex, String address){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }
        public Human(String name, int age, boolean sex, String address, boolean work){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.work = work;
        }
        public Human(String name, int age, boolean sex, String address, boolean work, boolean married){
         this.name = name;
         this.age = age;
         this.sex = sex;
         this.address = address;
         this.work = work;
         this.married = married;
        }
        public Human(int age, boolean sex){
         this.age = age;
         this.sex = sex;
        }
        public Human(String name, boolean sex, boolean work){
            this.name = name;
            this.sex = sex;
            this.work = work;

        }
        public Human(boolean sex, String address){
            this.sex = sex;
            this.address = address;

        }

    }
}
