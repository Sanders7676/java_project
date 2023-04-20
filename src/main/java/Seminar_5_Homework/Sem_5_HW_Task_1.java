package Seminar_5_Homework;

// 1. Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sem_5_HW_Task_1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        addNote("Попов", "583-930-395", phoneBook);
        addNote("Никитин", "567-895-378", phoneBook);
        addNote("Семенов", "123-098-456", phoneBook);
        addNote("Захаров", "578-063-964", phoneBook);
        addNote("Попов", "759-345-934", phoneBook);
        addNote("Семенов", "830-256-036", phoneBook);
        addNote("Захаров", "759-249-048", phoneBook);
        addNote("Евгенич", "578-456-891", phoneBook);
        addNote("Попов", "026-549-749", phoneBook);
        printPhoneBook(phoneBook);
    }

    // Метод добавления записей в телефонную книгу
    // в зависимости от наличия в ней информации по конкретному человеку
    public static void addNote(String key, String value, Map<String, ArrayList<String>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    // Метод вывода на печать сформированной телефонной книги
    public static void printPhoneBook(Map<String, ArrayList<String>> map){
        for (var item : map.entrySet()) {
            String phoneNumbers = "";
            for(String el: item.getValue()){
                phoneNumbers = phoneNumbers + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phoneNumbers);
        }
    }
}
