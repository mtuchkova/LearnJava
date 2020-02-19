package javaOOP.lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class lesson10 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(10,"ten");
        map1.put(1,"one");
        map1.put(5,"five");

        System.out.println(map1);


        String text =  map1.get(50);
        System.out.println(text);

        Set<Integer> keys = map1.keySet();

        for (Integer key : keys){
            System.out.println(key + " -> " + map1.get(key));
        }



    }
}
