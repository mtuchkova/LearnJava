package javaOOP.lesson2.homework.level1.l2ex1;

public class Rectangle  extends Shape{

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Rectangle( Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public Rectangle() {
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

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }


    @Override
    public double getPerimetr() {
        return (pointA.calculateDistance(pointB) + pointB.calculateDistance(pointC)) * 2;
    }

    @Override
    public double getArea() {
        return pointA.calculateDistance(pointB) * pointB.calculateDistance(pointC);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                " pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", pointD=" + pointD +
                '}';
    }
}
