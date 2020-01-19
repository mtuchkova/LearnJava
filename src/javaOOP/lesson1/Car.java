package javaOOP.lesson1;

public class Car {
    String color;
    double weight;
    int year;
    private double velosity;


    public Car(String color, double weight, int year) {
        this.color = color;
        this.weight = weight;
        this.year = year;
    }

    public Car() {
    }

    @Override
    public String
    toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void beep(){
        System.out.println("BEEP-BEEP!!!");
    }
    public void acceleration (double a){
        velosity=velosity+a;
    }
    public void deceleration(double b){
        if(velosity-b>=0) velosity=velosity-b;
    }

}
