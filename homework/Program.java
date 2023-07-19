package ru.homework;

import java.util.HashSet;

public class Program {

    public static void createHashSet(){
        HashSet<Cat> hashSet = new HashSet<>();
        hashSet.add(new Cat("Barsik", "white", 2, 5));
        hashSet.add(new Cat("Tom", "black", 3, 5));
        hashSet.add(new Cat("Murka", "brown", 2, 9));
        hashSet.add(new Cat("Tom", "white", 3, 5));
        hashSet.add(new Cat("Vasya", "ginger", 1, 1));
        hashSet.add(new Cat("Tom", "white", 3, 5));
        hashSet.add(new Cat("Kuzya", "black", 4, 8));
        System.out.println(hashSet);
    }
    public static void main(String[] args) {
        createHashSet();
    }
}
