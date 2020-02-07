package javaOOP.l2ex1;

public class Main {

    public static void main(String[] args) {

//        1. Создайте абстрактный класс Shape, в котором есть два абстрактных метода double getPerimetr() и double getArea().
//        2. Создайте класс Point, в котором есть два свойства double x double y.
//        3. Создайте классы, которые описывают, как минимум, три геометрические фигуры (они должны быть подклассами
//        Shape). При этом они в качестве свойств должны содержать классы Point.
//        4. Создайте класс доска. Доска поделена на 4 части в каждую часть доски можно положить одну из фигур. У доски должны
//        быть методы которые помещают и удаляют фигуру с доски. Также должен быть метод который выводит информацию о
//        всех фигурах лежащих на доске и их суммарную площадь.
//        5. * Нарисуйте UML диаграмму проекта.


        Point pointA = new Point(3,1);
        Point pointB = new Point(2,8);
        Point pointC = new Point(1,5);


        Point pointD = new Point(3,0);
        Point pointE= new Point(6,0);
        Point pointF= new Point(6,4);
        Point pointG= new Point(3,4);

        Circle circleOne = new Circle(pointA, pointB);
        Triangle triangleOne = new Triangle(pointA, pointB, pointC);
        Rectangle rectangleOne = new Rectangle(pointD, pointE, pointF, pointG);

        System.out.println(circleOne.getArea());
        System.out.println(circleOne.getPerimetr());

        System.out.println(triangleOne.getArea());
        System.out.println(triangleOne.getPerimetr());

        System.out.println(rectangleOne.getArea());
        System.out.println(rectangleOne.getPerimetr());

    }
}
