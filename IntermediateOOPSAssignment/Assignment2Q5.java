package com.company;

import java.util.Scanner;

abstract class Shape5
{
    abstract public String draw();
}

class Rectangle5 extends Shape5
{
    @Override
    public String draw()
    {
        String drawRectangle="Rectangle drawn!!!";
        return drawRectangle;
    }
}

class Line5 extends Shape5
{
    @Override
    public String draw()
    {
        String drawLine="Straight Line Drawn!!!";
        return drawLine;
    }
}

class Cube5 extends Shape5
{
    @Override
    public String draw()
    {
        String drawCube="3D Cube has been drawn with 12 edges!!!";
        return drawCube;
    }
}

public class Assignment2Q5
{
    public static void main(String[] args)
    {
        Rectangle5 rectangle = new Rectangle5();
        Cube5 cube = new Cube5();
        Line5 line = new Line5();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1)
            System.out.println(rectangle.draw());
        if(choice == 2)
            System.out.println(line.draw());
        if(choice == 3)
            System.out.println(cube.draw());
        else
            System.out.println("WRONG CHOICE!!!");
    }
}

