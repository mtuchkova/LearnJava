package javaStart.lesson3.level1;

import java.util.Scanner;

public class l3lev1ex3 {
    public static void main(String[] args) {
//        Определить количество дней в году, который вводит пользователь.
//        В високосном году - 366 дней, тогда как в обычном 365


        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter year: ");
        int year = sc.nextInt();
        if((year % 400 == 0) || ((year % 4 == 0)) && (year % 100 != 0)){
            System.out.println("It`s a leap year!");
        } else {
            System.out.println("It  s not.");
        }



    }
}
