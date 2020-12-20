package javaOOP.lesson9.homework.level1.l9ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public  class LineForDoubleCola {

  private  List<String> queueForDoubleCola = new ArrayList<>(Arrays.asList("Sheldon","Leonard","Volovitc","Kutrapalli","Penny"));

    public  List<String> getQueueForDoubleCola() {
        return queueForDoubleCola;
    }

    public List<String> changeQueueForDoubleCola(int a) {

        for (int i =0; i < a; i++){
            queueForDoubleCola.add(queueForDoubleCola.get(0));
            queueForDoubleCola.add(queueForDoubleCola.get(0));
            queueForDoubleCola.remove(0);
        }
        return queueForDoubleCola;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineForDoubleCola that = (LineForDoubleCola) o;
        return Objects.equals(queueForDoubleCola, that.queueForDoubleCola);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueForDoubleCola);
    }

    @Override
    public String toString() {
        return "LineForDoubleCola{" +
                "queueForDoubleCola=" + queueForDoubleCola +
                '}';
    }
}
