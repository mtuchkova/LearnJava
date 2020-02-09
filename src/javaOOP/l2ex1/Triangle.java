package javaOOP.l2ex1;

public class Triangle extends Shape {

    private Point pointA;
    private Point pointB;
    private Point pointC;


    public Triangle( Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle() {
    }

    @Override
    public double getPerimetr() {
        return pointA.calculateDistance(pointB) + pointB.calculateDistance(pointC) +  pointA.calculateDistance(pointC);
    }

    @Override
    public double getArea() {
        return Math.sqrt(this.getPerimetr() * (this.getPerimetr() - pointA.calculateDistance(pointB)) * (this.getPerimetr() - pointB.calculateDistance(pointC)) * (this.getPerimetr() - pointA.calculateDistance(pointC)));
    }


    @Override
    public String toString() {
        return "Triangle{" +
                " pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }
}

