package javaStart.lesson7.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.String.format;

public class ex4 {
//    Введите строку текста с клавиатуры — реализуйте программу для
//    возможности подсчета количества символа — 'b' в этой строке, с выводом
//    результат на экран.

    public static void main(String[] args) {
        try {
            System.out.print("Enter word: ");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String word = bufferedReader.readLine();
            char[] array = word.toCharArray();
            int count = 0;
            for (char c : array) {
                if (c == 'b') count++;
            }
            System.out.println(format("The letter b is contained %d times in word %s", count, word));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
