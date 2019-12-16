package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man manSergey = new Man ("Sergey", 37, "Moscow");
        Man manDenis = new Man ("Denis", 28, "Piter");
        Woman womanOlya = new Woman("Olya", 35, "Kiev");
        Woman womanNastia = new Woman("Nastia", 25, "Orsk");
        System.out.println(manSergey.name + " " + manSergey.age + " " + manSergey.address);
        System.out.println(manDenis.name + " " + manDenis.age + " " + manDenis.address);
        System.out.println(womanOlya.name + " " + womanOlya.age + " " + womanOlya.address);
        System.out.println(womanNastia.name + " " + womanNastia.age + " " + womanNastia.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man() {
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name) {
            this.name = name;
        }

        public Man(String name, String address) {
            this.name = name;
            this.address = address;
        }
    }
        public static class Woman{
            String name;
            int age;
            String address;

            public Woman(){}
            public Woman(String name, int age, String address){
                this.name = name;
                this.age = age;
                this.address = address;
            }
            public Woman(String name){
                this.name = name;
            }
            public Woman(String name, String address){
                this.name = name;
                this.address = address;
            }

    }
}
