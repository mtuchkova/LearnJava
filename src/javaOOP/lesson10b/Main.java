package javaOOP.lesson10b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            list1.add((int)(Math.random() * 100));
        }

        list1.add(list1.get(0));

        System.out.println(list1);

        Map<Integer, Integer> stat = new HashMap<>();
        for (Integer element : list1) {
            Integer n = stat.get(element);
            if (n == null) {
                stat.put(element, 1);
            } else {
                stat.put(element, n+1);
            }



        }

        System.out.println(stat);
    }
}
