package ru.homework;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    static Deque<Integer> numsDeque = new LinkedList<>();
    static Deque<String> charsDeque = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Calculator.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        boolean f = true;
        while (f) {
            System.out.println("Выберите действие:");
            System.out.println("1 - выполнить вычисление");
            System.out.println("2 - показать предыдущую операцию");
            System.out.println("0 - завершение работы приложения");
            int act = Integer.parseInt(scanner.nextLine());
            switch (act) {
                case 1:
                    System.out.println("Введите первое число: ");
                    float n = Float.parseFloat(scanner.nextLine());
                    numsDeque.addFirst((int) n);
                    System.out.println("Выберите действие:");
                    System.out.println("1 - сложение");
                    System.out.println("2 - вычитание");
                    System.out.println("3 - умножение");
                    System.out.println("4 - деление");
                    int no = Integer.parseInt(scanner.nextLine());
                    System.out.println("Введите второе число: ");
                    float m = Float.parseFloat(scanner.nextLine());
                    numsDeque.addLast((int) m);
                    switch (no) {
                        case 1:
                            float res1 = n + m;
                            System.out.printf("Результат: %f\n", res1);
                            charsDeque.addFirst("+");
                            logger.info("Выполнена операция сложения");
                            break;
                        case 2:
                            float res2 = n - m;
                            System.out.printf("Результат: %f\n", res2);
                            charsDeque.addFirst("-");
                            logger.info("Выполнена операция вычитания");
                            break;
                        case 3:
                            float res3 = n * m;
                            System.out.printf("Результат: %f\n", res3);
                            charsDeque.addFirst("*");
                            logger.info("Выполнена операция умножения");
                            break;
                        case 4:
                            float res4 = n / m;
                            System.out.printf("Результат: %f\n", res4);
                            charsDeque.addFirst("/");
                            logger.info("Выполнена операция деления");
                            break;
                        default:
                            System.out.println("Введено неверное значение\nповторите попытку ввода.");
                            logger.info("Введено неверное значение");
                            break;

                    }
                    logger.info("Выбрано действие: выполнить вычисление");
                    break;
                case 2:
                    if (numsDeque.isEmpty() || charsDeque.isEmpty())
                        System.out.println("Предыдущая операция отсутствует");

                    else {
                        System.out.println("Предыдущая операция: " + numsDeque.peekFirst() + charsDeque.peekFirst()
                                + numsDeque.peekLast());
                    }
                    logger.info("Выбрано действие: показать предыдущую операцию");
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    f = false;
                    logger.info("Выбрано действие: завершение работы приложения");
                    break;
                default:
                    System.out.println("Введено неверное значение\nповторите попытку ввода.");
                    logger.info("Введено неверное значение");
                    break;
            }
        }
    }
}
