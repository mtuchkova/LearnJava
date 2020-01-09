package javaStart;

import java.util.Scanner;

public class l3lev2ex5 {
    public static void main(String[] args) {
//        Есть круг с центром в начале координат и радиусом 4.
//        Пользователь вводит с клавиатуры координаты точки x и y.
//        Написать программу которая определит лежит ли эта точка внутри круга или нет


        Scanner sc = new Scanner(System.in);


        do {
            System.out.print("Enter x-coordinate: ");
            int x = sc.nextInt();
            System.out.print("Enter y-coordinate: ");
            int y = sc.nextInt();
            int a = 4;

            if(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) < a) {
                System.out.println("the point belongs to the circle");
            } else  {
                System.out.println("the point doesn't belong to the circle");
            }
        } while (true);


    }
}
