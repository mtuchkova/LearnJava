package javaOOP.lesson2;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(6, 8,true, "milk", "Vaska", "home cat");


        System.out.println(cat.getAge());
        System.out.println(cat.hashCode());
        cat.getVoice();
        System.out.println(cat);

        Animals an = cat;
        System.out.println(cat.getName());
        an.getVoice();
    }
}
