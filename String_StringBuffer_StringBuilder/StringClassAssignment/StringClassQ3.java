package com.company;

public class StringClassQ3
{
    public static void main(String[] args)
    {
        String str1="Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println(str1.toLowerCase());                         //a
        System.out.println(str1.toUpperCase());                         //b
        System.out.println(str1.replace('a','$'));       //c
        System.out.println(str1.contains("collection"));                //d
        System.out.println(str1.equals("java string pool refers to collection of strings which are stored in heap memory"));    //e
        System.out.println(str1.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));          //f
    }
}
