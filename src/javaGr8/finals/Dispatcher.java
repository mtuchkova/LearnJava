package javaGr8.finals;

public class Dispatcher {
    public static void main(String[] args) {

        int x = 10;
        x++;
        final Human h = new Human(22);
        h.birthday ++;
    }
}

class Human {
    static final String NAME = "SIA";
    String address;
    int weight;
    int birthday;

    public Human(int birthday) {

        this.birthday = birthday;
    }
}
