package breakLesson;

public class Dispatcher {
    public static void main(String[] args) {


//       outer: for (int i = 0;i<3;i++){
//            for (int j = 10; j<20;j++){
//                System.out.print(j + i*10 + " ");
//                if ( j ==16 ){
//                    break outer;
//                }
//            }
//            System.out.println();
//        }
//
//
//        System.out.println("End");





        outer: for (int i = 0;i<3;i++){
            for (int j = 10; j<20;j++){

                if ( j ==16 ){
                    continue outer;
                }
                System.out.print(j + i*10 + " ");
            }
            System.out.println();
        }


        System.out.println("End");

    }
}
