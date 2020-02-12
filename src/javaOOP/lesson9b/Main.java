package javaOOP.lesson9b;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("Aihihih");
        list1.add("yaya");

        System.out.println(list1);

        list1.add(1,"Zat");
        System.out.println(list1);

        String temp = list1.get(2);
        System.out.println(temp);

        list1.set(0, "Masha");
        System.out.println(list1);

        list1.remove(0);
        System.out.println(list1);


        Collections.sort(list1);
        System.out.println(list1);



        ////////////////////////////
        for (String element : list1) {
            System.out.println(element);
        }

////////////////////////////////

        Iterator<String> itr = list1.iterator();
        for (;itr.hasNext();){
            String element = itr.next();
            System.out.println(element);
        }
///////////////////////


    }
}
