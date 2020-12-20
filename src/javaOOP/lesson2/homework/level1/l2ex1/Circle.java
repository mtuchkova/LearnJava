package javaOOP.lesson2.homework.level1.l2ex1;

public class Circle extends Shape {

    private Point pointA;
    private Point pointB;


    public Circle(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Circle() {
    }

    public Point getPointA() {
        return pointA;
    }
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }
    public Point getPointB() {
        return pointB;
    }
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }


    @Override
    public double getPerimetr() {
        return 2 * Math.PI * pointA.calculateDistance(pointB);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(pointA.calculateDistance(pointB), 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                " pointA = " + pointA +
                ", pointB = " + pointB +
                '}';
    }

}
