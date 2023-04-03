package Seminar_2_Homework;

public class Sem_2_HW_Task_1 {
    public static void main(String[] args) {
        // 1. Напишите метод, который принимает на вход строку (String)
        // и определяет является ли строка палиндромом (возвращает boolean значение).

        // String str = "fhgidifikfdsosoaol";
        String str = "fhgiddighf";
        // String str = "fhgidadighf";

        if (isPalindrom(str)) {
            System.out.println("Cтрока является палиндромом");
        } else {
            System.out.println("Cтрока не является палиндромом");
        }
    }

    private static boolean isPalindrom(String str) {
        char[] charStringArr = str.toCharArray();
        if (charStringArr.length % 2 == 0) {
            for (int i = 0; i < charStringArr.length / 2; i++) {
                //int indFromEnd = charStringArr.length - 1;
                if (charStringArr[i] == charStringArr[(charStringArr.length - 1) - i]) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            for (int i = 0, indFromEnd = charStringArr.length - 1; i < ((charStringArr.length - 1) / 2); i++, indFromEnd--) {
                if (charStringArr[i] == charStringArr[indFromEnd]) {
                    return true;
                } else {
                    return false;
                }
            }
        }

    }
}
