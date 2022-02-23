package com.company;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.PARAMETER, ElementType.METHOD})

@interface Info
{
    int AuthorID();
    String Author() default "Heavenly Silkworm Potato";
    String Supervisor() default "Qidian";
    String Date();
    String Time();
    int version();
    String description() default "Reading...";
}

class Developer
{
    @Info(AuthorID = 0233, Date = "12-12-2009", Time = "5:00pm", version = 6)
    public void displayMethod()
    {
        System.out.println("Author Info:");
    }
}

public class AnnotationQ2
{
    public static void main(String[] args) throws Exception
    {
        Developer writter = new Developer();
        Method m = writter.getClass().getMethod("displayMethod");

        Info w1 = m.getAnnotation(Info.class);
        System.out.println("ID:"+w1.AuthorID());
        System.out.println("Name:"+w1.Author());
        System.out.println("Supervior:"+w1.Supervisor());
    }
}
