package javaOOP.lesson7;

public class Service {

    private long[] threadsId;
    private int n = 0;

    public synchronized void printText (String text) {
        Thread thr = Thread.currentThread();
        long threadId = thr.getId();
        for (;threadsId[n] != threadId;){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(text + " ");
        n = ( n + 1 )% threadsId.length;
        notifyAll();
    }

    public void  register(Thread...threads) {
        threadsId = new long[threads.length];
        for (int i= 0; i < threads.length; i++){
            threadsId[i] = threads[i].getId();
        }
    }
}
