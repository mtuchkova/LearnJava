package improvisation.functionalInterface.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Masha", "Dasha", "Zoya", "Antonina"));
        System.out.println(names);

        //TODO реализация с помощью анномного класса
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        });
        System.out.println(names);

    }
}
