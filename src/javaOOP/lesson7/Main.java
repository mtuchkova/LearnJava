package javaOOP.lesson7;

public class Main {
    public static void main(String[] args) {

        Service s = new Service();

        Thread mainThread = Thread.currentThread();


        PushPullTask push1 = new PushPullTask(s,"1");
        PushPullTask pull1 = new PushPullTask(s, "2");
        PushPullTask push2 = new PushPullTask(s,"3");
        PushPullTask pull2 = new PushPullTask(s, "4");

        Thread thread1 = new Thread(push1);
        Thread thread2 = new Thread(pull1);
        Thread thread3 = new Thread(push2);
        Thread thread4 = new Thread(pull2);

        s.register(thread1,thread2, thread3, thread4);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();



    }
}
