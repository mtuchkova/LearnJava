package javaOOP.l1ex1;

public class Main {
    public static void main(String[] args) {

//        Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
//        Наделить его свойствами и методами. Создать несколько экземпляров объектов
//        этого класса. Использовать эти объекты.


        Cat cat1 = new Cat(2,6.7, "Rich", "fish", true);
        Cat cat2 = new Cat("Anna", "meet");


        cat1.feedCat();
        cat2.feedCat();

        cat1.cuddleCat();

        cat2.setLikesCuddle(true);
        cat2.cuddleCat();


    }
}