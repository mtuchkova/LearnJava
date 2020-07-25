package javaGr8.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Dispatcher {
    public static void main(String[] args) {
        ArrayList<Car> al = new ArrayList();
        Car car1 = new Car("BMW");
        //Dog dog1 = new Dog("Tax");

//        //Collection
//
//        System.out.println( al.size());
//        al.add(5);
//        al.add(car1);
//        al.add(dog1);
//        System.out.println(al);
//
//        System.out.println("======================");
//        System.out.println(al.contains(car1));
//        System.out.println(al.contains("sdfds"));
//
//
//        // List
//        al.add(2, "Figaro");
//        System.out.println(al);
//        System.out.println("======================");
//        System.out.println(al.get(3));
//        System.out.println(al.indexOf(dog1));
//        System.out.println("======================");
//        al.remove(dog1);
//        System.out.println(al);
//        System.out.println("======================");
//
//        System.out.println("======================");
//        String find = (String) al.get(2);
//        System.out.println(find);


        // part4

        al.add(new Car("model1"));
        al.add(new Car("model2"));
        al.add(new Car("model3"));
        al.add(new Car("model4"));
        al.add(new Car("model5"));
        Car[] c = new  Car[al.size()];
        al.toArray(c);
        for (Car temp : c) {
            System.out.println(temp);
        }
        c[2]  = new Car("model 88");

        al = new ArrayList(Arrays.asList(c)) ;
        System.out.println(al);
    }
}
