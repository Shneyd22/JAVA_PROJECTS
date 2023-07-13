package ru.homework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Phonebook {
    static Scanner scanner = new Scanner(System.in);
//    Написать простой класс Телефонный Справочник (с помощью HashMap),
//    который хранит в себе список фамилий и телефонных номеров.
//    В этот телефонный справочник с помощью метода add() можно добавлять записи,
//    а с помощью метода get() искать номер телефона по фамилии.
//    Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//    тогда при запросе такой фамилии должны выводиться все телефоны.
//
//***Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
//    взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода
//    результатов проверки телефонного справочника.


    public static void main(String[] args) {
        String[] data = {
                "ИВАНОВ 123456",
                "КОЗЛОВ 376943",
                "КОЗЛОВ 872367",
                "ПЕТРОВ 182736",
                "СИДОРОВ 987654",
                "СИДОРОВА 602345",
        };
        HashMap<String, List<Integer>> hashMap = new HashMap<>();
        for (String person : data) {
            String[] parts = person.split(" ");

            if (hashMap.containsKey(parts[0])) {
                 List<Integer> lst = hashMap.get(parts[0]);
                 lst.add(Integer.parseInt(parts[1]));
            } else {
                ArrayList<Integer> lst = new ArrayList<>();
                lst.add(Integer.parseInt(parts[1]));
                hashMap.put(parts[0].toUpperCase(), lst);
            }
        }

        boolean f = true;
        while (f) {
            System.out.println("Выберите действие:");
            System.out.println("1 - найти номер телефона по фамилии");
            System.out.println("2 - добавить запись в тел. справочник");
            System.out.println("0 - завершить работу приложения");
            int act = Integer.parseInt(scanner.nextLine());
            switch (act) {
                case 1:
                    findRecord(hashMap);
                    break;
                case 2:
                    addRecord(hashMap);
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    f = false;
                    break;
                default:
                    System.out.println("Введено неверное значение\nповторите попытку ввода.");
                    break;
            }
        }
    }

    public static void findRecord(HashMap<String, List<Integer>> hashMap){
        System.out.println("Введите фамилию : ");
        String name = scanner.nextLine().toUpperCase();
            if (hashMap.containsKey(name)) {
                System.out.println("Результат поиска: ");
                System.out.println(name + ":");
                List<Integer> phones = hashMap.get(name);
                for (Integer phone : phones)
                System.out.println(phone);
            }
            else{
                System.out.println("Поиск не дал результатов");
            }

        }

        public static void addRecord(HashMap<String, List<Integer>> hashMap){
            System.out.println("Введите фамилию : ");
            String name = scanner.nextLine().toUpperCase();
            System.out.println("Введите номер телефона");
            int phone = Integer.parseInt(scanner.nextLine());
            if (hashMap.containsKey(name)) {
                List<Integer> lst = hashMap.get(name);
                lst.add(phone);
            }
            else {
                ArrayList<Integer> lst = new ArrayList<>();
                lst.add(phone);
                hashMap.put(name, lst);
            }
        }
}
