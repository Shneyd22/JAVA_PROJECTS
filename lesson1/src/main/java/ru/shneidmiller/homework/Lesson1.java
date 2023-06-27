package ru.shneidmiller.homework;

import java.util.Scanner;

public class Lesson1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while(f){
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Задача 1");
            System.out.println("2 - Задача 2");
            System.out.println("3 - Задача 3");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());

            switch(no){

                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    f = false;
                    break;
                default:
                    System.out.println("Некорректный номер задачи,\nповторите попытку ввода.");
                    break;
            }
        }
    }
    public static void task1(){
        //Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        System.out.println("Введите целое число: ");
        int n = Integer.parseInt(scanner.nextLine());
        int res = 0;
        for (int i = 0; i <= n; i++){
            res = res + i;
        }
        System.out.printf("Треугольное число от %d равно %d\n", n, res);

    }
    public static void task2(){
        //Вывести все простые числа от 1 до 1000
        for (int i = 2; i <= 100; i++){
            int count = 0;
            for (int j = 2; j < i; j++){
                if (i % j == 0) count ++;
                }
            if (count == 0) System.out.println(i);
            }
        }

    public static void task3(){
        //Реализовать простой калькулятор
        System.out.println("Введите первое число: ");
        float n = Float.parseFloat(scanner.nextLine());
        System.out.println("Введите второе число: ");
        float m = Float.parseFloat(scanner.nextLine());
        System.out.println("Выберите действие:");
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - умножение");
        System.out.println("4 - деление");
        int no = Integer.parseInt(scanner.nextLine());
        switch(no) {

            case 1:
                float res1 = n + m;
                System.out.printf("Результат: %f", res1);
                break;
            case 2:
                float res2 = n - m;
                System.out.printf("Результат: %f", res2);
                break;
            case 3:
                float res3 = n * m;
                System.out.printf("Результат: %f", res3);
                break;
            case 4:
                float res4 = n / m;
                System.out.printf("Результат: %f", res4);
                break;
            default:
                System.out.println("Введено неверное значение\nповторите попытку ввода.");
                break;
        }
        System.out.println();
    }
}
