package javaStart.lesson4.level1;

import java.util.Scanner;

public class l4lev1ex1 {
    public static void main(String[] args) {

// С помощью циклов нарисовать «обои». Причем количество полос
// должно вводиться с клавиатуры. В примере 7 полос.
//***+++***+++***+++***
//***+++***+++***+++***
//***+++***+++***+++***

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i=1;i<=5;i++){
            for(int j=0;j<n;j++){
                if (j%2==0) {
                    System.out.print("***");
                } else {
                    System.out.print("пусто");
                }
            }
            System.out.println();
        }

    }
}






