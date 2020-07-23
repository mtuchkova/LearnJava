package javaGr8.polymorphism;

public class Bird {
  void move () {
    System.out.println("Different ways");
}
}


class Swallow extends Bird {

     void move() {
        System.out.println("Fly");

//    public void move() {
//
//}
    }

}
    class Strauss extends Bird {

         void move() {
            System.out.println("Run");
        }


    }
