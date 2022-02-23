package com.company;
import java.lang.reflect.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute {
    public int Sequence();
}

class MyClass {

    @Execute(Sequence=2)
    public void myMethod1()
    {
        System.out.println("Hi");
    }
    @Execute(Sequence=1)
    public void myMethod2()
    {
        System.out.println("Hello");
    }

    @Execute(Sequence=3)
    public void myMethod3()
    {
        System.out.println("Hello World!");
    }
}

public class AnnotationQ3
{
    public static void main(String[] args) throws Exception
    {
        MyClass m = new MyClass();
        Method a= m.getClass().getMethod("myMethod1");
        Method b= m.getClass().getMethod("myMethod2");
        Method c= m.getClass().getMethod("myMethod3");
        Execute a1E= a.getAnnotation(Execute.class);
        Execute b1E = b.getAnnotation(Execute.class);
        Execute c1E = c .getAnnotation(Execute.class);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
