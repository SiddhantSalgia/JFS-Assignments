import java.lang.annotation.*;
import java.lang.reflect.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface test
{
    int value();
}

//Applying annotation
class MyAnnotation
{
    @test(value=15)
    public void displayMethod()
    {
        System.out.println("I am here testing!!!");
    }
}

//Accessing annotation
public class AnnotationQ1
{
    public static void main(String[] args)throws Exception
    {

        MyAnnotation obj=new MyAnnotation();
        Method m=obj.getClass().getMethod("displayMethod");

        test man=m.getAnnotation(test.class);
        System.out.println("value is: "+man.value());
    }
}
