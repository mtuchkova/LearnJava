package itvdn;

public class TrySwitch {
    public static void main(String[] args) {

        String a = "r";

        switch (a){
            case "a":
                System.out.println("a");
               // break;
            case "b":
            case "r":
                System.out.println("+");
               // break;
            case "t":
                System.out.println("-");
                break;
        }
    }
}
