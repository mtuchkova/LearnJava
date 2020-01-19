package javaOOP.lesson1;

import javaOOP.lesson1.Car;

public class Main {


    public static void main(String[] args) {

     Car car1 = new Car("Green", 2000, 200);
        //резерв памяти



     Car car2 = new Car();
        car2.getColor();
        car2.setColor("rfr");

        System.out.println(car1);
        System.out.println(car2);

        // 2 объекта






    }
}
