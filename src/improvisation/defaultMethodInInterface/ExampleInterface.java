package improvisation.defaultMethodInInterface;

public interface ExampleInterface {
     public default String getMessage(){
         return "Default message";
     }
}
