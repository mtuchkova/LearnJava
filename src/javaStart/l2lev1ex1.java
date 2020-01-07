package javaStart;

import java.util.Scanner;


//Написать программу которая считывает 5-и значное число с клавиатуры и выводит цифры из которого оно состоит.

public class l2lev1ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter a 5 digit number:");
          int x = sc.nextInt();
          System.out.println(x);
            int q = x / 10000;
            int w = x % 10000 / 1000;
            int e = x % 1000 / 100;
            int r = x % 100 / 10;
            int t = x % 10;
            int w1 = x % 10000;
            System.out.println(q);
            System.out.println(w);
            System.out.println(e);
            System.out.println(r);
            System.out.println(t);
            System.out.println(w1);
//        } catch (Exception ex){
//            ex.printStackTrace();
//        }

    }
}
