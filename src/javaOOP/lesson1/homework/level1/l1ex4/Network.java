package javaOOP.lesson1.homework.level1.l1ex4;

import java.util.ArrayList;
import java.util.List;

public class Network {

    private String mobileOperator;
    private List<String> arrayNumber = new ArrayList<>();

    public Network(String mobileOperator) {
        this.mobileOperator = mobileOperator;
    }

    public List<String> getArrayNumber() {
        return arrayNumber;
    }

    public void addToArrayNumber(String number) {
        this.arrayNumber.add(number);
    }

    public void printArrayNumber() {
        for (String number : arrayNumber) {
            System.out.println(number);
        }
    }
}