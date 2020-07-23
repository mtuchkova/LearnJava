package javaGr8.Arrays;

import java.util.Arrays;

public class Dispatcher {
    public static void main(String[] args) {
        int[] x = {4,3,1,7,8,0,2};
        Arrays.sort(x);
        int index = Arrays.binarySearch(x,2);
        System.out.println(index);

        System.out.println("sd");
        //
        int [] [] z = {{2,6},{1}, {8,9,4}, {4,7,2}} ;
        int [] [] t;
        t = new int [4][];
        t[0] = new int[2];
        t[0][0] = 2;
        t[0][1] = 1;
    }
}
