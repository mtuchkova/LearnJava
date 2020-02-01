package javaOOP.l2ex1;

public class Circle extends Shape {


    private Point pointA;
    private Point pointB;
    private double perimetrCircle;
    private double areaCircle;
    private double radiusCircle;
    private String name;

    public Circle(String name, Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.name = name;
        this.radiusCircle = pointA.calculateDistance(pointB);
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

    public double getPerimetrCircle() {
        return perimetrCircle;
    }

    public void setPerimetrCircle(double perimetrCircle) {
        this.perimetrCircle = perimetrCircle;
    }

    public double getAreaCircle() {
        return areaCircle;
    }

    public void setAreaCircle(double areaCircle) {
        this.areaCircle = areaCircle;
    }





    @Override
    public double getPerimetr() {

        perimetrCircle = 2 * Math.PI * this.radiusCircle;
        return perimetrCircle;
    }

    @Override
    public double getArea() {

        areaCircle = Math.PI * Math.pow(this.radiusCircle, 2);
        return areaCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " name = " + name +
                ", pointA = " + pointA +
                ", pointB = " + pointB +
                ", perimetrCircle = " + perimetrCircle +
                ", areaCircle = " + areaCircle +
                ", radiusCircle = " + radiusCircle +

                '}';
    }







}
