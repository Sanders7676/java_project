package Seminar_2_Homework;

import java.util.Arrays;

public class Sem_2_HW_Task_1 {
    public static void main(String[] args) {
        // 1. Напишите метод, который принимает на вход строку (String)
        // и определяет является ли строка палиндромом (возвращает boolean значение).

        // String str = "fhgidifikfdsosoaol";
        // String str = "fhgiddighf";
        String str = "fhgidadighf";

        // Version 1

        if (isPalindromVers1(str)) {
            System.out.println("V1: Cтрока является палиндромом");
        } else {
            System.out.println("V1: Cтрока не является палиндромом");
        }

        // Version 2

        if (isPalindromVers2(str)) {
            System.out.println("V2: Cтрока является палиндромом");
        } else {
            System.out.println("V2: Cтрока не является палиндромом");
        }
    }


    // Version 1. Метод проверки на палиндром через сравнение элементов массива
    private static boolean isPalindromVers1(String str) {
        char[] charStringArr = str.toCharArray();
        for (int i = 0; i < charStringArr.length / 2; i++) {
            if (charStringArr[i] != charStringArr[(charStringArr.length - 1) - i]) {
                return false;
            }
        }
        return true;
    }


    // Version 2. Метод проверки на палиндром через разворот массива
    private static boolean isPalindromVers2(String str) {
        char[] charStringArr = str.toCharArray();
        char[] reversedArr = new char[charStringArr.length];
        for (int i = 0; i <= charStringArr.length - 1; i++) {
            reversedArr[i] = charStringArr[(charStringArr.length - 1) - i];
        }
        // System.out.println(charStringArr);
        // System.out.println(reversedArr);
        boolean areArraysEqual = Arrays.equals(charStringArr, reversedArr);
        return areArraysEqual;
    }
}
