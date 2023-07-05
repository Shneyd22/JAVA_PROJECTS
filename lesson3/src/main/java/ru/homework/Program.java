package ru.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Пусть дан произвольный список целых чисел.
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение
public class Program {
    static ArrayList<Integer> list = new ArrayList<>();
    static Random random = new Random();
    static void listFilling(ArrayList<Integer> arrayList){
        int size = random.nextInt(10, 21);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(101));
        }
        System.out.println("Первоначальный список: " + arrayList);
    }

    static void task1(ArrayList<Integer> arrayList){
        ArrayList<Integer> list1 = new ArrayList<>(arrayList);
        list1.removeIf(n -> n%2 == 0);
        System.out.println("Список после удаления четных чисел: " + list1);
    }

    static void task2(ArrayList<Integer> arrayList){
        int minim = Collections.min(arrayList);
        System.out.println("Миним. значение в списке: " + minim);
    }

    static void task3(ArrayList<Integer> arrayList){
        int maxim = Collections.max(arrayList);
        System.out.println("Максим. значение в списке: " + maxim);
    }

    static void task4(ArrayList<Integer> arrayList){
        double sum = 0;
        for (int i = 0; i < arrayList.size(); i++){
            sum += arrayList.get(i);
        }
        double res = sum / arrayList.size();
        System.out.println("Сред. значение элементов списка: " + res);
    }
    public static void main(String[] args) {
        listFilling(list);
        task1(list);
        task2(list);
        task3(list);
        task4(list);
    }
}
