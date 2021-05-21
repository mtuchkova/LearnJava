package improvisation.defaultMethodInInterface;

public class ExampleInterfaceAImpl implements ExampleInterface {
     private String message;

    public ExampleInterfaceAImpl(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ExampleInterfaceAImpl{" +
                "message='" + message + '\'' +
                '}';
    }
}
