package javaGr8.polymorphism;

public class Dispatcher {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.move();

        Swallow swallow1 = new Swallow();
        swallow1.move();

        Bird swallow2 = new Swallow();
        swallow2.move();
    }
}
