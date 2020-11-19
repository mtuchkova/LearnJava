package itvdn;

public class Recursion {
    public static void main(String[] args) {
recursion(2);
    }


    static void recursion(int counter){
        counter--;
        System.out.println("A: " + counter);

        if (counter != 0){

            recursion(counter);
        }

        System.out.println("B: " + counter);
    }
}
