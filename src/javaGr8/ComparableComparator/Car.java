package javaGr8.ComparableComparator;

public class Car implements Comparable{

    int speed;
    int price;
    String model;
    String color;

    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed= " + speed +
                ", price= " + price +
                ", model= '" + model + '\'' +
                ", color= '" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.speed - ((Car)o).speed;
    }
}
