package javaGr8.forEach;

public class Dispatcher {
    public static void main(String[] args) {
        int[] x = {1,3,4,6,2,4,8,3};

//       for (int i = 0; i < x.length; i++){
//           System.out.print(x[i] + " ");
//       }

        Car c1 = new Car("Lada", 5);
        Car c2 = new Car("Opel", 30);
        Car c3 = new Car("Citroen", 200);
        Car[] c = {c1,c2,c3};

        for (Car temp : c){
            temp.price = temp.price + 3;
        }

        for (Car temp : c){
            System.out.println(temp.model + " " + temp.price);
        }
    }
}
