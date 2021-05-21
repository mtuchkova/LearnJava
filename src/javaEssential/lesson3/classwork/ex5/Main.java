package javaEssential.lesson3.classwork.ex5;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        instance.field1 = 1;
        instance.field2 = 2;
        instance.field3 = 3;

        instance.field4 = 4;
        instance.field5 = 5;

        //Upcast
        BaseClass baseClass = (BaseClass) instance;

        System.out.println(baseClass.field1);
//        System.out.println(baseClass.field4);

        BaseClass baseClass1 = instance;

        System.out.println(baseClass1.field1);
//        System.out.println(baseClass1.field4);

    }
}
