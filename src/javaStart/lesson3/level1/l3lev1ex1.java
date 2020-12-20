package javaStart.lesson3.level1;

import java.util.Scanner;

public class l3lev1ex1 {
    public static void main(String[] args) {
//        Написать программу которая считает 4 числа c клавиатуры и выведет на экран самое большое из них.

        int[] a = new int[3];
        int k = 0;
        Scanner in = new Scanner(System.in);


        for (int i = 1; i < a.length + 1; i++) {
            System.out.print("Введите " + i + "-й элемент массива: ");
            a[k] = in.nextInt();
            k++;
        }

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, a[i]);

        }
        System.out.println(max);

    }
}
