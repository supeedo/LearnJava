package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        Cat cat1 = new Cat();
        result.add(cat1);
        Cat cat2 = new Cat();
        result.add(cat2);
        Cat cat3 = new Cat();
        result.add(cat3);
        Cat cat4 = new Cat();
        result.add(cat4);
        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();
        Dog dog1 = new Dog();
        result.add(dog1);
        Dog dog2 = new Dog();
        result.add(dog2);
        Dog dog3 = new Dog();
        result.add(dog3);
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> object = new HashSet<>();
        object.addAll(cats);
        object.addAll(dogs);
        return object;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);

    }

    public static void printPets(Set<Object> pets) {
        for (Object object: pets) {
            System.out.println(object);
        }
    }

    public static class Cat{

    }
    public static class Dog{

    }
}
