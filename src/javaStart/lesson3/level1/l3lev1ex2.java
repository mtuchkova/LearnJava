package javaStart.lesson3.level1;

import java.util.Scanner;

public class l3lev1ex2 {
    public static void main(String[] args) {
//        Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда начинается с единицы.
//        На одном этаже 4 квартиры. Напишите программу которая получит номер квартиры с клавиатуры,
//        и выведет на экран на каком этаже, какого подъезда расположенна эта квартира.
//        Если такой квартиры нет в этом доме то нужно сообщить об этом пользователю.






        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть номер квартири");
        int n = sc.nextInt();
        int p = (n - 1) / 36 + 1;
        int e = (n - 1) % 36 / 4 + 1;
        if (n > 0 && n < 145) {
            System.out.println("Підїзд " + p);
            System.out.println("Поверх " + e);
        } else {
            System.out.println("Квартири з даним номером не існує в цьому будинку");

        }

        //
    //
    //
    //        Scanner sc = new Scanner (System.in);
    //
    //        int n;
    //        int a;
    //        System.out.println("Input number from 1 to 144");
    //        n = sc.nextInt();
    //
    //        if (n >= 1 && n <= 36) {
    //            System.out.println("Entrance 1");
    //        }
    //        if (n >= 37 && n <= 72) {
    //            System.out.println("Entrance 2");
    //        }
    //        if (n >= 73 && n <= 108) {
    //            System.out.println("Entrance 3");
    //        }
    //        if (n >= 109 && n <= 144) {
    //            System.out.println("Entrance 4");
    //        }
    //
    //        a = n % 36;
    //
    //        if (a >= 1 && a <= 4) {
    //            System.out.println("Floor 1");
    //        }
    //        if (a >= 5 && a <= 8) {
    //            System.out.println("Floor 2");
    //        }
    //        if (a >= 9 && a <= 12) {
    //            System.out.println("Floor 3");
    //        }
    //        if (a >= 13 && a <= 16) {
    //            System.out.println("Floor 4");
    //        }
    //        if (a >= 17 && a <= 20) {
    //            System.out.println("Floor 5");
    //        }
    //        if (a >= 21 && a <= 24) {
    //            System.out.println("Floor 6");
    //        }
    //        if (a >= 25 && a <= 28) {
    //            System.out.println("Floor 7");
    //        }
    //        if (a >= 29 && a <= 32) {
    //            System.out.println("Floor 8");
    //        }
    //        if (a >= 33 && a <= 36) {
    //            System.out.println("Floor 9");
    //        }
    //        if (n == 36 || n == 72 || n == 108 || n == 144) {
    //            System.out.println("Floor 9");
    //        }
    //    }
    //    //


    Scanner sc1 = new Scanner(System.in);
		System.out.println("Input number of apartment:");
    int num = sc1.nextInt();
    int entracne = 0;
    int floor = 0;
    int temp = 0;
		if ((num > 0) && (num <= 144)) {
        entracne = ((num - 1) / 36) + 1;
        temp = num - 36 * (entracne - 1);
        if (temp % 4 == 0) {
            floor = temp / 4;
        } else {
            floor = (temp / 4) + 1;
        }
        System.out.println("Apartment number " + num + " is on " + floor + " floor in " + entracne + " entrance.");
    } else {
        System.out.println("This apartment is not in this house!");
    }
		sc.close();
		//




    }
}
