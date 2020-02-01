package javaOOP.l2ex1;

public class Point {


    private double x;
    private double y;
    private double distance;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    public double calculateDistance (Point pointB) {
        distance = Math.sqrt(Math.pow((this.getX() - pointB.getX()), 2) + Math.pow(this.getY() - pointB.getY(), 2));
        return distance;
    }
}
