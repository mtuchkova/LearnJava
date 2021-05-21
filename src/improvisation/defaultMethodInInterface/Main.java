package improvisation.defaultMethodInInterface;

public class Main {
    public static void main(String[] args) {
        ExampleInterfaceAImpl exampleA = new ExampleInterfaceAImpl("Hello");
        ExampleInterfaceBImpl exampleB = new ExampleInterfaceBImpl("Hello");
        System.out.println(exampleA.getMessage());
        System.out.println(exampleB.getMessage());


    }
}
