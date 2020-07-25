package javaGr8.showCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Dispatcher {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar();
        int today = gc.get(Calendar.DAY_OF_MONTH);
        int weekday = gc.get(Calendar.DAY_OF_WEEK) - 1;
        int month = gc.get(Calendar.MONTH);
        System.out.println("Mon   Tue   Wed   Thu   Fri   Sat   Sun");
        for (int i = 1; i < weekday; i++){
            System.out.print("      ");
        }

        gc.set(Calendar.DAY_OF_MONTH,1);

        do {
            int day = gc.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);
            if (day == today) {
                System.out.print("*  ");
            } else {
                System.out.print("   ");
            }

            if (weekday % 7 == 0){
                System.out.println();
            }
            gc.add(Calendar.DAY_OF_MONTH, 1);
            weekday = gc.get(Calendar.DAY_OF_WEEK ) - 1;
        } while (gc.get(Calendar.MONTH) == month);

    }
}
