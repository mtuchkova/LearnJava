package javaOOP.l1ex2;

public class Main {
    public static void main(String[] args) {

//2) Описать класс «Triangle». В качестве свойств возьмите длины сторон
//треугольника. Реализуйте метод, который будет возвращать площадь этого
//треугольника. Создайте несколько объектов этого класса и протестируйте их.

    Triangle triangle1 = new Triangle(2,5,6);
        System.out.println(triangle1.calculateArea());
        System.out.println(triangle1);


    }
}
