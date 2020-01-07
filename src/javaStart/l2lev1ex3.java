package javaStart;

import java.util.Scanner;

public class l2lev1ex3 {
    public static void main(String[] args) {
//        Написать программу которая вычислит и выведет на экран длину
//        окружности, если ее радиус считывается с клавиатуры.

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter radius: ");
            int r = sc.nextInt();
            double l = 2 * 3.14 * r;
            System.out.println("L = " + l);
        } while (true);
    }
}
