package Seminar_5_Homework;

// 2. Пусть дан список сотрудников:

// Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов,
// Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,
// Иван Мечников, Петр Петин, Иван Ежов

// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sem_5_HW_Task_2 {
    public static void main(String[] args) {
        String[] listOfEmployees = new String[]{"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин"};
        ArrayList<String> employeesNames = getNamesFromListOfEmployees(listOfEmployees);
        Map<String, Integer> mapRepeatedNames = getMapRepeatsOfNames(employeesNames);
        printRepeatedNames(mapRepeatedNames);
        printNamesInDescendingOrderOfPopularity(mapRepeatedNames);

        // Или без промежуточных структур
        printRepeatedNames(getMapRepeatsOfNames(getNamesFromListOfEmployees(listOfEmployees)));
        printNamesInDescendingOrderOfPopularity(getMapRepeatsOfNames(getNamesFromListOfEmployees(listOfEmployees)));

    }

    // Метод получения имен работников из общего списка Имя-Фамилия
    public static ArrayList<String> getNamesFromListOfEmployees(String[] list) {
        ArrayList<String> namesOfEmployees = new ArrayList<>();
        for (String el : list) {
            String[] nameAndFamily = el.split(" ");
            namesOfEmployees.add(nameAndFamily[0]);
        }
        // System.out.println(namesOfEmployees);     // Проверка формирования ArrayList<String> namesOfEmployees
        return namesOfEmployees;
    }

    // Метод получения HashMap, содержащего имена и количество их повторений в списке имен работников
    public static Map<String, Integer> getMapRepeatsOfNames(ArrayList<String> name) {
        Map<String, Integer> mapRepeatsOfNames = new HashMap<>();
        for (int i = 0; i < name.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < name.size(); j++) {
                if (name.get(i).equals(name.get(j))) count += 1;
            }
            if (!mapRepeatsOfNames.containsKey(name.get(i))) mapRepeatsOfNames.put(name.get(i), count);
        }
        // System.out.println(mapRepeatsOfNames);     // Проверка формирования Map<String, Integer> mapRepeatsOfNames
        return mapRepeatsOfNames;
    }

    // Метод вывода на экран перечня имен с количеством их повторений
    public static void printRepeatedNames(Map<String, Integer> map) {
        System.out.println("\nСписок повторяющихся имен: \n");
        for (var item : map.entrySet()) {
            if (item.getValue() > 1) System.out.printf("%s: %d \n", item.getKey(), item.getValue());
        }
    }

    // Метод вывода на экран перечня всех имен в порядке убывания популярности
    // (т.е. количества их повторений в общем списке работников)
    public static void printNamesInDescendingOrderOfPopularity(Map<String, Integer> map) {
        System.out.println("\nИмена, отсортированные по убыванию популярности: \n");
        ArrayList<Integer> countList = new ArrayList<>();
        for (var item : map.entrySet()) {
            if (!countList.contains(item.getValue())) countList.add(item.getValue());
        }
        countList.sort(null);
        for (int i = countList.size() - 1; i > -1; i--) {
            for (var item : map.entrySet()) {
                if (countList.get(i) == item.getValue())
                    System.out.printf("%s: %d \n", item.getKey(), item.getValue());
            }
        }
    }
}
