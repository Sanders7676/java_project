package Seminar_3_Homework;

// Задание 3. Доделать начатое на семинаре.
// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Пройтись по списку из задания 2 и удалить повторяющиеся элементы.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sem_3_HW_Task_3 {
    public static void main(String[] args) {
        // Используется Неизменяемая коллекция - List.of
        List<String> planetNames = List.
                of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto");
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(planetNames.get(random.nextInt(9)));
        }
        // Выводится список названиями планет Солнечной системы в произвольном порядке с повторениями
        System.out.println(list);

        // Формируем и выводим новый список без повторений
        List<String> newList = new ArrayList<>();
        for (String element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        System.out.println(newList);
    }
}
