package javaStart.lesson7.level1;

public class ex1 {
    //Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета
    //нечетных цифр в нем.


    public static void main(String[] args) {
        int[] numbers = {0, 5, 2, 4, 7, 1, 3, 19};
        int temp = 0;
        for (int number : numbers) {
            if (number == 0 || number % 2 != 0) temp++;
        }
        System.out.println(temp);
    }
}
