package Seminar_2_Homework;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Sem_2_HW_Task_2 {
    public static void main(String[] args) {
        // Задача 2. Напишите метод, который составит строку,
        // состоящую из 100 повторений слова TEST и метод,
        // который запишет эту строку в простой текстовый файл, обработайте исключения.

        StringBuilder requestedObject = MakeStringOf100TEST();
        WriteToFile(requestedObject);
    }


    // Метод записи требуемого объекта в текстовый файл (.txt)
    private static void WriteToFile(StringBuilder requestedObject) {
        try(PrintWriter writeToFile = new PrintWriter("src/main/java/Seminar_2_Homework/ToTask_2.txt")) {
            writeToFile.print(requestedObject);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    // Метод создания строки (стрингбилдера) заданного значения
    private static StringBuilder MakeStringOf100TEST() {
        String str = "TEST";
        StringBuilder test_100 = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            test_100.append(i).append(": ").append(str).append(System.lineSeparator());
        }
        //System.out.println(test_100);
        return test_100;
    }
}
