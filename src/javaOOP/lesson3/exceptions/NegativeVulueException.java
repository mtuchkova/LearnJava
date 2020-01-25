package javaOOP.lesson3.exceptions;

public class NegativeVulueException extends Exception {

    private double number;

    public NegativeVulueException(double number) {
        super();
        this.number = number;
    }


    public double getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "NegativeVulueException{" +
                "number=" + number +
                '}';
    }











}
