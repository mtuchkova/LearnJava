package javaGr8.breakLesson;

public class ex2_shildt {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++){
//                if (i == j) break;
//                System.out.print(i * j + " ");
//
//            }
//            System.out.println();
//        }


        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(i * j + " ");

            }
        }
    }
}
