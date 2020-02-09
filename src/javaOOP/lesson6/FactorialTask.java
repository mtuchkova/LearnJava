package javaOOP.lesson6;

import java.math.BigInteger;

public class FactorialTask implements  Runnable{

    private int n;
    public FactorialTask(int n){
        super();
        this.n = n;
    }


    public BigInteger factorial(int n){
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++){
            fact = fact.multiply(new BigInteger("" + i));
        }
        return fact;
    }


    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        for (int i = 1; i <= n; i++) {

            if (thr.isInterrupted()) {
                System.out.println(thr.getName() + "Interrupted");
                return;
            }

            System.out.println(thr.getName() + " -> " + i + " != " + factorial(i));
        }
    }


}
