import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReflectionMain {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car();
        car.setName("BMW");
        System.out.println(car.getName());
        Field name = Car.class.getDeclaredField("name");
        name.setAccessible(true);
        name.set(car, "test");
        System.out.println(car.getName());

        Annotation[] annotations = Car.class.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.toString());
        }
    }
}
