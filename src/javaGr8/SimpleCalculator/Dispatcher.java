package javaGr8.SimpleCalculator;

import javaGr8.SimpleCalculator.Controller;

public class Dispatcher {
    public static void main(String[] args) {

        Model m1 = new Model();
        Model m2 = new Model();


        m1.x = 50;
        m1.y = 8;

        Controller c = new Controller();
        int sum = Controller.add(m1);

       View v = new View();
        View.displayInteger(sum);

        int sub = Controller.substruct(m1);
        View.displayInteger(sub);

        m2.x = 2;
        m2.y = 3;



    }
}
