package javaStart.lesson8.level1;

public class l8lev1ex1 {
    public static void main(String[] args) {
        int[] arrayInt = {1,31,5,1,8,24};

        searchMaxNumber(arrayInt);

    }

    static void searchMaxNumber(int[] array){

        int maxNumber=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>maxNumber) {
                maxNumber= array[i];
            }
        }

        System.out.println(maxNumber);
    }
};

