package javaOOP.l9ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
