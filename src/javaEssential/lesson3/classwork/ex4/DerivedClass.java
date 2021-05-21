package javaEssential.lesson3.classwork.ex4;

public class DerivedClass extends BaseClass {
    public int derivedField;

    public DerivedClass(int number1, int number2) {

        super(number1);
        derivedField = number2;
    }
}
