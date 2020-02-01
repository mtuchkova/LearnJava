package javaOOP.l2ex1;

public class Rectangle  extends Shape{


    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;
    private double perimetr;
    private double area;
    private String name;
    private double distanceAB;
    private double distanceBC;
    private double distanceCD;
    private double distanceAD;



    public Rectangle(String name, Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
        this.name = name;
        this.distanceAB = pointA.calculateDistance(pointB);
        this.distanceBC = pointB.calculateDistance(pointC);
        this.distanceCD = pointC.calculateDistance(pointD);
        this.distanceAD = pointA.calculateDistance(pointD);
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

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceAB() {
        return distanceAB;
    }

    public void setDistanceAB(double distanceAB) {
        this.distanceAB = distanceAB;
    }

    public double getDistanceBC() {
        return distanceBC;
    }

    public void setDistanceBC(double distanceBC) {
        this.distanceBC = distanceBC;
    }

    public double getDistanceCD() {
        return distanceCD;
    }

    public void setDistanceCD(double distanceCD) {
        this.distanceCD = distanceCD;
    }

    public double getDistanceAD() {
        return distanceAD;
    }

    public void setDistanceAD(double distanceAD) {
        this.distanceAD = distanceAD;
    }

    @Override
    public double getPerimetr() {
        perimetr = (distanceAB + distanceBC) * 2;
        return perimetr;
    }

    @Override
    public double getArea() {
        area = distanceAB * distanceBC;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", pointD=" + pointD +
                ", perimetr=" + perimetr +
                ", area=" + area +
                ", name='" + name + '\'' +
                ", distanceAB=" + distanceAB +
                ", distanceBC=" + distanceBC +
                ", distanceCD=" + distanceCD +
                ", distanceAD=" + distanceAD +
                '}';
    }
}
