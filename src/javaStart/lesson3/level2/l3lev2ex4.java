package javaStart.lesson3.level2;

import java.util.Scanner;

public class l3lev2ex4 {
    public static void main(String[] args) {
//        Треугольник существует только тогда, когда сумма любых двух его
//        сторон больше третьей. Дано: a, b, c – стороны предполагаемого треугольника.
//        Напишите программу которая укажет существует такой треугольник или нет

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("such a triangle exists");
        } else {
            System.out.println("triangle doesn't exist");
        }
    }
}
