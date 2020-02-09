package javaOOP.lesson6;

public class Main {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        System.out.println(mainThread.getName() + "Start" );
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



        FactorialTask fact1 = new FactorialTask(10);
        FactorialTask fact2 = new FactorialTask(10);
        FactorialTask fact3 = new FactorialTask(10);

        Thread thread1 = new Thread(fact1);
        Thread thread2 = new Thread(fact2);
        Thread thread3 = new Thread(fact3);

        thread1.start();
        thread2.start();
        thread3.start();

//        try {
//            thread1.join();
//            thread2.join();
//            thread3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();


        System.out.println(mainThread.getName() + "-->" + mainThread.getId());
    }
}
