package javaGr8.FractionCalculator;

public class Calculator {

    public static Fraction add(Fraction f1, Fraction f2) {
        Fraction sum = new Fraction();
        sum.denumerator = f1.denumerator * f2.denumerator;
        sum.numerator = f1.numerator * f2.denumerator + f2.numerator * f1.denumerator;
        return sum;
    }

}
