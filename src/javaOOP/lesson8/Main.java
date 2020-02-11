package javaOOP.lesson8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Jerry", 2);
        Cat cat2 = new Cat("Umka", 12);


        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());


        Cat cat3 = null;
        try {
            cat3 = cat1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        System.out.println(cat3 != cat1);
        System.out.println(cat3.getClass() == cat1.getClass());
        System.out.println(cat3.equals(cat1));


        System.out.println("=====================================================================");


        Class catClass = Cat.class;
        Class catClass1 = cat1.getClass();
        System.out.println(cat1.getClass());

        Field [] catField = catClass1.getDeclaredFields();
        for (int i = 0; i < catField.length; i++) {
            System.out.println(catField[i]);
        }

        System.out.println("=====================================================================");

        Method [] catMethods = catClass1.getDeclaredMethods();

        for (int i = 0; i < catMethods.length; i++) {
            System.out.println(catMethods[i]);
        }

        System.out.println("=====================================================================");

        Class [] catInterface = catClass1.getInterfaces();

        for (int i = 0; i < catInterface.length; i++) {
            System.out.println(catInterface[i]);
        }
// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        try {
            Field catAge = catClass1.getDeclaredField("age");
            catAge.setAccessible(true);
            catAge.setInt(cat1, 100500);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }

//
//        for (int i = 0; i < catField.length; i++) {
//            System.out.println(catField[i]);
//        }

        System.out.println("=====================================================================");
    }
}
