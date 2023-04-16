package Seminar_1_Homework;

import java.util.Arrays;

public class Sem_1_HW_Task_2 {

    // 2. Дан массив nums = [3,2,2,3] и число val = 3.
    // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    // Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
    // а остальные - равны ему.
        
    public static void main(String[] args) {
        int array[] = new int[] {3, 2, 2, 3};
        // int array[] = new int[] {3, 2, 2, 3, 4, 3, 8, 4, 3, 5, 3, 2};

        System.out.printf("Массив с перемещенными элементами будет выглядеть так: %s%n", Arrays.toString(ThreeEndedArray(array)));
    }

    // Метод создания массива с тройками в конце массива
    private static int[] ThreeEndedArray(int array[]) {
        int val = 3;
        int indexEnd = array.length - 1;
        int indexStart = 0;
        int[] remasteredArray = new int[array.length];
        for (int el : array) {
            if (el == val) {
                remasteredArray[indexEnd] = el;
                indexEnd--;
            } else {
                remasteredArray[indexStart] = el;
                indexStart++;
            }
        }
        return (remasteredArray);
    }
}
