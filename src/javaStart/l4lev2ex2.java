package javaStart;

import java.util.Scanner;

public class l4lev2ex2 {
    public static void main(String[] args) {
        //        С помощью циклов вывести на экран все простые числа от 1 до 100

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number: ");
        int n = sc.nextInt();

        for ( int i = 1; i < n; i++) {
            if (n % i != 0) {
                System.out.println("число простое");
            } else {
                System.out.println("число не простое");
            }
        }
    }
}
