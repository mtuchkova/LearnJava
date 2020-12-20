package javaStart.lesson3.level2;

import java.util.Scanner;

public class l3lev2ex8 {
    public static void main(String[] args) {
//        С клавиатуры вводиться шестизначное число. Проверить, является ли оно палиндромом.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 6 digit number:");
        int x = sc.nextInt();
        int position1 = x / 100000;
        int position2 = x % 100000 / 10000;
        int position3 = x % 10000 / 1000;
        int position4 = x % 1000 / 100;
        int position5 = x % 100 / 10;
        int position6 = x % 10;
        if ((position1 == position6) && (position2 == position5) && (position3 == position4)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome!");
        }


    }
}
