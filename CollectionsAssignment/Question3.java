package com.company;

import java.util.*;

public class Question3
{
    public static void main(String[] args)
    {
        List<String> myDate = new LinkedList<>();
        myDate.add("26-08-2000");
        myDate.add("27-07-2001");
        myDate.add("24-02-2005");
        myDate.add("26-01-2010");
        for(String i : myDate)
        {
            String[] strings = i.split("-");
            if((int)Integer.parseInt(strings[2])%4==0)
            {
                if((int)Integer.parseInt(strings[2])%100==0)
                {
                    if((int)Integer.parseInt(strings[2])%400==0)
                        System.out.println("DOB is "+i+" it was Leap Year");
                    else
                    {
                        System.out.println("DOB is "+i+" it was not Leap Year");
                    }
                }
                else
                {
                    System.out.println("DOB is "+i+" it was Leap Year");
                }
            }
            else
            {
                System.out.println("DOB is "+i+" it was not Leap Year");
            }
        }
    }
}
