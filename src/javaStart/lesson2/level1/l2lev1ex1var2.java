package javaStart.lesson2.level1;

import java.util.Scanner;

public class l2lev1ex1var2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 5 digit number: ");
        int x = sc.nextInt();
        String x1 = Integer.toString(x);
        char[] array = x1.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
}
}
