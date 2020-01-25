package javaOOP.l1ex2;

public class Triangle {

    private double a;
    private double b;
    private double c;
    private double area;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public double calculateArea() {


        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        this.area = area;
        return area;


    }


    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", area=" + area +
                '}';
    }
}
