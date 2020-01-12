package javaStart;

import java.util.Scanner;

public class l4lev1ex2 {
    public static void main(String[] args) {
//        Вычислить с помощью цикла факториал числа - n введенного с клавиатуры (4<n<16)


        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int result = n;
            for (int i = 1; i < n; i++) {
                result *= i;
            }
            System.out.println(result);
        } while (true);



    }
}
