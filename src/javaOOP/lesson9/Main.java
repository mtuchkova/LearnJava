package javaOOP.lesson9;

public class Main {
    public static void main(String[] args) {


//        Stack<Integer> stack1 = new Stack<>();
//        stack1.push(5);
//        stack1.push(1);
//      // stack1.push("seven");
//
//        System.out.println(stack1);
//
//        Integer sum = 0;
//
//        for (;stack1.peek() != null;){
//            sum += (Integer) stack1.pop();
//
//        }
//
//        System.out.println(sum);
//
//
//        Stack<String> stack2 = new Stack<>();
//        stack2.push("Hello");
//        stack2.push(" world");
//        //stack2.push(3);
//        System.out.println(stack2);
//
//      //  System.out.println(stack1.peek());

    Integer[] array = new Integer[] {0,2,-4,4};
    Integer min = getMin(array);
        System.out.println(min);


    }

    public static <T extends Comparable<T>> T getMin(T[] array) {
        T min = array[0];
        for (T element : array) {
            if ( min.compareTo(element) > 0) {
                min = element;
            }
        }
        return min;
    }
}



