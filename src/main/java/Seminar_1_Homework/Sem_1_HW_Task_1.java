package Seminar_1_Homework;

public class Sem_1_HW_Task_1 {

    // Задача 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

    public static void main(String[] args) {

        int array[] = new int[] {3, 2, 4, 8, 6, 9, 7, 90, 2, 5};

        System.out.printf("Минимальный элемент массива равен: %s%n", GetMinElementInArray(array));
        System.out.printf("Максимальный элемент массива равен: %s%n", GetMaxElementInArray(array));
    }

    // Метод нахождения максимального элемента массива
    private static int GetMaxElementInArray(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Метод нахождения минимального элемента массива
    private static int GetMinElementInArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
