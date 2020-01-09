package javaStart;

import java.util.Scanner;

public class l3lev2ex6 {
    public static void main(String[] args) {
//        Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1).
//        Пользователь вводит с клавиатуры координаты точки x и y.
//        Написать программу которая определит лежит ли эта точка внутри треугольника или нет.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4 digit number: ");
        int x = sc.nextInt();
        String x1 = Integer.toString(x);
        char[] array = x1.toCharArray();

    if ((array[0]+array[1]) == (array[2] + array[3])){
        System.out.println("It's a happy ticket!");
    } else {
        System.out.println("don't worry!");
    }








    }
}
