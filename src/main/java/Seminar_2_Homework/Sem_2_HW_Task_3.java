package Seminar_2_Homework;

import java.io.File;

public class Sem_2_HW_Task_3 {
    public static void main(String[] args) {

        // Задача 3*.Напишите метод, который определит тип (расширение)
        // файлов из текущей папки и выведет в консоль результат вида:
        // 1 Расширение файла: txt
        // 2 Расширение файла: pdf
        // 3 Расширение файла:
        // 4 Расширение файла: jpg

        CatchFileExtentions("src/main/resources/Files");
    }


    private static void CatchFileExtentions(String pathDir) {
        File file = new File(pathDir);
        if (!file.isDirectory()) {
            return;
        }

        String[] fileNamesInFolder = file.list();

        StringBuilder allFileNamesInFolder = new StringBuilder();
        for (String fileName : fileNamesInFolder) {
            allFileNamesInFolder.append(fileName).append(System.lineSeparator());
        }

        System.out.println("В заданной папке находятся файлы со следующими расширениями:");
        for (int i = 0; i < fileNamesInFolder.length ; i++) {
            String temp = fileNamesInFolder[i];
            //System.out.println(temp);
            String[] arr = temp.split("\\.");
            System.out.printf(".%s%n", arr[1]);
        }
    }
}