package javaGr8.ComparableComparator;

import java.util.Arrays;

public class Dispatcher {
    public static void main(String[] args) {

        int[] x = {2, 3,8,2,4,7,1};
        String[] s = {"Paul", "Lasha", "Aaaa", "Zita"};


        Arrays.sort(x);
        Arrays.sort(s);

        for (int xi : x) {
            System.out.print(xi + " ");
        }


        for (String si : s) {
            System.out.print(si + " ");
        }


        Car car1 = new Car(180,2000000,"BMW", "black");
        Car car2 = new Car(120,100000,"Tavria", "White");
        Car car3 = new Car(200,1500000,"Citroen", "Grey");

        Car[] cars = {car1, car2, car3};


        Arrays.sort(cars);
        System.out.println();

        for (Car car : cars) {
            System.out.println(car + " ");
        }
    }
}
