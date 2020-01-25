package javaOOP.l1ex4;

public class Network {

    protected String mobileOperator;
    Phone[] arrayNumber =new Phone[10];

    public Network(String mobileOperator) {
        this.mobileOperator = mobileOperator;

    }






    public void printArrayNumber() {
        for (int i = 0; i<arrayNumber.length; i++){
            System.out.println(arrayNumber[i]);
        }
    }
}