package Seminar_4_Homework;

//1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;
import java.util.Scanner;

public class Sem_4_HW_Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        System.out.println("Вам нужно ввести строку или команду:\n" +
                "- print - чтобы вывести строки в обратном порядке \n" +
                "- revert - чтобы удалить последнюю запись \n" +
                "- finish - чтобы завершить программу\n");

        while (true) {
            System.out.println("Введите строку или команду: ");
            String input = scanner.nextLine();

            if (input.equals("print")) {
                System.out.println("Строки, введенные Вами в обратном порядке:");
                while (!list.isEmpty()) {
                    System.out.println(list.removeLast());
                }
            } else if (input.equals("revert")) {
                if (!list.isEmpty()) {
                    list.removeLast();
                    System.out.println("Последняя из введенных строк удалена из памяти.");
                } else {
                    System.out.println("Нет сохраненных строк для удаления.");
                }
            } else if (input.equals("finish")) {
                break;
            } else {
                list.addLast(input);
            }
        }
    }
}
