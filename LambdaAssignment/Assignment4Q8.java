package com.company;

import java.util.*;
import java.util.function.Consumer;

public class Assignment4Q8
{
    public static void main(String[] args)
    {
        List<Integer> lst = Arrays.asList(2,4,6,8,10,12,14);
        Consumer<List<Integer>> dispList = list->list.stream().forEach(a-> System.out.println(a + " "));
        Thread t = new Thread(()->dispList.accept(lst));
        t.start();
    }
}
