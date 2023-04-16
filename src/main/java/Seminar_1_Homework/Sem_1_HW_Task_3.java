package Seminar_1_Homework;

import java.time.LocalTime;
import java.util.Scanner;

public class Sem_1_HW_Task_3 {

    // Задача 3*. В консоли запросить имя пользователя.
    // В зависимости от текущего времени, вывести приветствие вида:

    // "Доброе утро, <Имя>!", если время от 05:00 до 11:59
    // "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    // "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    // "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

    public static void main(String[] args) {
        GreetingAccordingToTime();
    }

    // Метод вывода приветствия в зависимости от точного времени
    private static void GreetingAccordingToTime() {
        System.out.println("Как Вас зовут?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        // System.out.printf("Привет, %s%n", name);

        LocalTime now = LocalTime.now();

        LocalTime time0500 = LocalTime.of(5, 00);
        LocalTime time1159 = LocalTime.of(11, 59);
        LocalTime time1200 = LocalTime.of(12, 00);
        LocalTime time1759 = LocalTime.of(17, 59);
        LocalTime time1800 = LocalTime.of(18, 00);
        LocalTime time2259 = LocalTime.of(22, 59);
        LocalTime time2300 = LocalTime.of(23, 00);
        LocalTime time0459 = LocalTime.of(4, 59);

        if (time0500.isBefore(now) && time1159.isAfter(now)) {
            System.out.printf("Доброе утро, %s! %n", name);
        }

        if (time1200.isBefore(now) && time1759.isAfter(now)) {
            System.out.printf("Добрый день, %s! %n", name);
        }

        if (time1800.isBefore(now) && time2259.isAfter(now)) {
            System.out.printf("Добрый вечер, %s! %n", name);
        }

        if (time2300.isBefore(now) && time0459.isAfter(now)) {
            System.out.printf("Доброе утро, %s! %n", name);
        }
    }
}
