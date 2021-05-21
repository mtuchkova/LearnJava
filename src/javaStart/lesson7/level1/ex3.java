package javaStart.lesson7.level1;

import java.util.Random;

public class ex3 {
//    Создать массив случайных чисел (размером 15 элементов). Создайте
//    второй массив в два раза больше, первые 15 элементов должны быть
//    равны элементам первого массива, а остальные элементы заполнить
//    удвоенных значением начальных. Например
//    Было → {1,4,7,2}
//    Стало → {1,4,7,2,2,8,14,4}


    public static void main(String[] args) {

        int[] arrayFirst = new int[15];
        int[] arraySecond = new int[30];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = new Random().nextInt(15);
        }
        showArray(arrayFirst);
        for (int i = 0; i < arraySecond.length; i++) {
            if (i < 15) {
                arraySecond[i] = arrayFirst[i];
            } else {
                arraySecond[i] = arrayFirst[i - 15] * 2;
            }
        }
        showArray(arraySecond);

    }

    private static void showArray(int[] array) {
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}
