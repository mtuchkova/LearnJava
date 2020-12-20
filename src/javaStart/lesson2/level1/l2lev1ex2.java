package javaStart.lesson2.level1;

import java.util.Scanner;

public class l2lev1ex2 {

//     2) Написать программу которая вычислит и выведет на экран площадь
//     треугольника если известны его стороны.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(s);



    }
}
