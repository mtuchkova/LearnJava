package javaOOP.l2ex1;

public class Triangle extends Shape {

    Point pointA;
    Point pointB;
    Point pointC;
    private double perimetr;



    private String name;
    private double distanceAB;
    private double distanceBC;
    private double distanceAC;


    public Triangle(String name, Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.name = name;
        this.distanceAB = pointA.calculateDistance(pointB);
        this.distanceBC = pointB.calculateDistance(pointC);
        this.distanceAC = pointA.calculateDistance(pointC);
    }

    public Triangle() {
    }



    @Override
    public double getPerimetr() {

        perimetr = distanceAB + distanceBC + distanceAC;
        return perimetr;
    }

    @Override
    public double getArea() {

        return Math.sqrt(this.getPerimetr() * (this.getPerimetr() - distanceAB) * (this.getPerimetr() - distanceBC) * (this.getPerimetr() - distanceAC));

    }


    @Override
    public String toString() {
        return "Triangle{ " +
                " name='" + name +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", perimetr=" + perimetr +
                ", distanceAB=" + distanceAB +
                ", distanceBC=" + distanceBC +
                ", distanceAC=" + distanceAC +
                '}';
    }
}

