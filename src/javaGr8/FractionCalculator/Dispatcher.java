package javaGr8.FractionCalculator;

public class Dispatcher {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(2,7);
        Fraction f2 = new Fraction(3,8);
        Fraction summa = Calculator.add(f1, f2);
        View.display(summa);

    }
}
