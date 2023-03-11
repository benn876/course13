import lombok.Data;
import lombok.Value;

@Data
@MyFirstAnnotation
public class Car {
    @MyFirstAnnotation
    private String name;
    private int creationYear;

    @MyFirstAnnotation
    public void saySomething(){
        System.out.println("I'm giving up on you");
    }
}
