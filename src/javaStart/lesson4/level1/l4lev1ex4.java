package javaStart.lesson4.level1;

import java.util.Scanner;

public class l4lev1ex4 {
    public static void main(String[] args) {
        //        Выведите на экран прямоугольник из *. Причем высота и ширина прямоугольника вводятся с клавиатуры
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter height: ");
//        int height = sc.nextInt();
//        System.out.print("Enter width: ");
//        int width = sc.nextInt();

        int height = 3;
        int width = 2;
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
