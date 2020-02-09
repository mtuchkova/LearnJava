package javaOOP.lesson7;

public class PushPullTask implements Runnable{


private Service s;
private String text;


    public PushPullTask(Service s, String text) {
        super();
        this.s = s;
        this.text = text;
    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
       for (int i = 0; i< 5; i ++) {
           s.printText(text);
       }



    }
}
