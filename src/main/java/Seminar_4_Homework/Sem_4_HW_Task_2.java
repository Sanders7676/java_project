package Seminar_4_Homework;

// 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Sem_4_HW_Task_2 {
    public static void main(String[] args) {
        LinkedList<String> initialList = new LinkedList<>();
        initialList.add("1");
        initialList.add("2");
        initialList.add("3");
        initialList.add("4");
        initialList.add("5");
        initialList.add("6");
        initialList.add("7");

        System.out.println("Первоначальный список: " + initialList);
        System.out.println("Развернутый список: " + reverseLinkedList(initialList));
    }

    // Метод создания развернутого LinkedList
    public static LinkedList<String> reverseLinkedList(LinkedList<String> initialList) {
        LinkedList<String> reversedList = new LinkedList<>();
        for (int i = initialList.size() - 1; i >= 0; i--) {
            reversedList.add(initialList.get(i));
        }
        return reversedList;
    }
}
