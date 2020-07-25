package javaGr8.exceptions1;

public class Dispatcher {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int[] z = {2,6,1,7};
        System.out.println("Start");
       try {
           System.out.println(z[5]);
           System.out.println(x/y);

           System.out.println("ffggg");
           System.out.println("After deviding ");
       } catch (ArithmeticException e){
           System.out.println("Inside ArithmeticException");
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println(" Inside ArrayIndexOutOfBoundsException");
           System.out.println(e);
       }

        System.out.println("End");

    }
}
