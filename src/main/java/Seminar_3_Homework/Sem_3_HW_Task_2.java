package Seminar_3_Homework;

// Задание 2. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Collections;

public class Sem_3_HW_Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(28);
        numbers.add(2);
        numbers.add(38);
        numbers.add(25);
        numbers.add(26);
        numbers.add(17);
        numbers.add(12);

        System.out.println("Наш список выглядит так: " + numbers);

        System.out.println("Максимальное значение в списке: " + Collections.max(numbers));
        System.out.println("Минимальное значение в списке: " + Collections.min(numbers));

        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }
        float average = (float) sum/ numbers.size();

        System.out.println("Среднее арифметическое значение в списке: " + average);
    }
}
