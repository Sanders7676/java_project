package Seminar_3_Homework;

// Задание 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
// (в языке уже есть что-то готовое для этого)

import java.util.ArrayList;

public class Sem_3_HW_Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Добавление элементов в ArrayList
        numbers.add(28);
        numbers.add(15);
        numbers.add(38);
        numbers.add(25);
        numbers.add(26);
        numbers.add(17);
        numbers.add(120);
        System.out.println("Наш список выглядит так: " + numbers);

        // Удаление четных чисел
        numbers.removeIf(e -> (e % 2) == 0);
        System.out.println("Список с удаленными четными числами: " + numbers);
    }
}
