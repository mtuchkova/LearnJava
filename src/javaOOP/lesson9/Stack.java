package javaOOP.lesson9;

import java.util.Arrays;

public class Stack <E extends Number>{

    private Object[] elements;
    private final int size;
    private int top;


    public Stack(){
        size = 10;
        elements = new Object[size];
        top = 0;
    }

    public Stack(int size) {
        super();
        this.size = size;
        elements = new Object[size];
        top = 0;
    }


    public boolean push(E obj) {
        if(top == size - 1) {
            return false;
        }

        if (top == -1){
            top = 0;
        }

        elements[top] = obj;
        top+= 1;
        return true;
    }


    public E pop(){
      if(top>=0) {
          Object temp = elements[top - 1];
          elements[top] = null;
          top -= 1;
          return (E)temp;
      }
      return null;
    }



    public E peek(){
        if(top>0) {
            Object temp = elements[top - 1];
            return (E)temp;
        }
        return null;
    }

    @Override
    public String toString() {
        String res = "[";
        for (int i = 0; i < top; i++) {
            res +=elements[i] + " , ";
        }
        if(res.length()>1){
            res = res.substring(0, res.length() - 2);
        }
        res += "]";
        return res;
    }
}
