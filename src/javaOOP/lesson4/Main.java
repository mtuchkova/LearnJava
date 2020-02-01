package javaOOP.lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Vaska", 6);
        Cat cat2 = new Cat("Kaska", 16);
        Cat cat3 = new Cat("Maska", 4);
        Cat cat4 = new Cat("Laska", 17);
        Cat cat5 = new Cat("Qaska", 14);
        Cat cat6 = new Cat("Xaska", 1);


        Cat[] cats = new Cat[] {cat1, cat2, null, cat4, null, cat6};


        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println();

//        Arrays.sort(cats, new CatNameConparator().reversed());
//        Arrays.sort(cats, new CatAgeComparator().reversed());
        Arrays.sort(cats, new CatAgeComparator());

        for (Cat cat : cats) {
            System.out.println(cat);
        }


    }
}
