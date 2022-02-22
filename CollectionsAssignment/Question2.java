package com.company;

import java.util.*;

public class Question2
{
    public static void main(String[] args)
    {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Cherries");
        fruits.add("Pineapple");
        fruits.add("Grapes");
        fruits.add("Avocado");
        fruits.add("Beans");
        fruits.add("Coconut");
        fruits.add("Walnut");
        System.out.println(fruits);
        fruits.add("Coconut");
        System.out.println(fruits);
    }
}
