package javaStart.lesson7.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.String.format;

public class ex2 {
//    Написать код для возможности создания массива целых чисел (размер вводиться с
//    клавиатуры) и возможности заполнения каждого его элемента вручную. Выведите этот массив на экран.


    public static void main(String[] args) {
        try {
            System.out.print("Enter array size: ");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int size = Integer.valueOf(bufferedReader.readLine());
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                System.out.println(format("Enter %s element value: ", i));
                array[i] = Integer.valueOf(bufferedReader.readLine());
            }

            for (int element : array) {
                System.out.println(element);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
