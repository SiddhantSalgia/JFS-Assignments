package com.company;

abstract class name
{
    String name;
    name(String name)
    {
        this.name=name;
    }
    public  abstract String getname();
}

class Hito extends name
{
    Hito(String name)
    {
        super(name);
    }
    public  String getname()
    {
        return ("Hello,"+this.name);
    }
}
abstract class Sid
{
    public abstract void print1();
}
class  ClassA extends Sid
{
    @Override
    public void print1()
    {
        System.out.println("Subclass Implementation of the display method.");
    }
}
abstract class Sid2
{
    public abstract void print2();
}

class ClassB extends Sid2
{
    public void print2()
    {
        System.out.println("Not Private Class.");
    }
}
abstract class Sid3
{
    public void print()
    {
        System.out.println("Abstract Class Without Abstract Method.");
    }
}
class Sid4 extends Sid3{
}

public class Assignment2Q4
{
    public static void main(String[] args)
    {
        Hito obj = new Hito("I am the best");
        System.out.println(obj.getname());
        new ClassA().print1();
        new ClassB().print2();
    }
}
