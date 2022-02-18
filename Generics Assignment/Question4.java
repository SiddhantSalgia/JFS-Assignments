package com.company;
import java.util.Date;

class Pair <K,V>
{
    K obj1;
    V obj2;

    public void setKey(K obj1)
    {
        this.obj1=obj1;
    }
    public void setValue(V obj2)
    {
        this.obj2=obj2;
    }

    public void print()
    {
        System.out.println(this.obj1);
        System.out.println(this.obj2);
    }
}

public class Question4 {
    public static void main(String[] args)
    {
        Pair<String,String> myObj = new Pair<>();
        myObj.setKey("1");
        myObj.setValue("Hello");
        myObj.print();                          //a

        System.out.println("\n");

        Pair<String,java.util.Date> anotherObj = new Pair<>();
        anotherObj.setKey("Today is");
        anotherObj.setValue(new Date());
        anotherObj.print();                     //b
    }
}
