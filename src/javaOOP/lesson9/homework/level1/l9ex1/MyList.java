package javaOOP.lesson9.homework.level1.l9ex1;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    public static void createChangeShowList() {
        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            ar.add(i);
        }
        System.out.println(ar);
        ar.remove(0);
        ar.remove(0);
        ar.remove(ar.size()-1);
        System.out.println(ar);
    }
}
