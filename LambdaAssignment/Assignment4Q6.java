package com.company;


import java.util.List;
import java.util.*;

interface UpperCaseConversion
{
    List<String> convertToUpperCase(List<String> list);
}

public class Assignment4Q6
{
    public static void main(String[] args)
    {
        List<String> myList = new ArrayList<>();
        myList.add("battle");
        myList.add("nirvana");
        myList.add("symbols");
        myList.add("spear");
        myList.add("flames");
        UpperCaseConversion ucc = (list)->
        {
            list.replaceAll(String::toUpperCase);
            return list;
        };
        System.out.println(ucc.convertToUpperCase(myList));
    }
}
