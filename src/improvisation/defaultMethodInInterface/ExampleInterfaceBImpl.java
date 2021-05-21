package improvisation.defaultMethodInInterface;

public class ExampleInterfaceBImpl implements ExampleInterface {
     private String message;

    public ExampleInterfaceBImpl(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ExampleInterfaceBImpl{" +
                "message='" + message + '\'' +
                '}';
    }
}
