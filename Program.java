package ru.homework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    // Пусть дан LinkedList с несколькими элементами.
    // Реализуйте метод, который вернет “перевернутый” список.
    public static void task1() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("один");
        arrayList.add("два");
        arrayList.add("три");
        arrayList.add("четыре");
        arrayList.add("пять");
        System.out.println(arrayList);
        Deque<String> deque = new LinkedList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            deque.addFirst(arrayList.get(i));
        }
        System.out.println(deque);
    }

    public static void main(String[] args) {
        task1();
    }
}
