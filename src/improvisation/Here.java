package improvisation;

public class Here {

    public static class Main {
        public static void main(String[] args){
            //Must explicitly chose Method1 from Class1 or Class2
            System.out.println(Class1.Method1());
            System.out.println(Class2.Method1());

        }
    }static class Class1 {
        public static int Method1(){
            return 0;
        }
    }
    static class Class2 extends Class1 {

        public static int Method1(){
            return 1;
        }

    }

}