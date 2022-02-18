package com.company;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println("Before swap:");
        System.out.println(list);
        Collections.swap(list,0,1);
        System.out.println("After Swap");
        System.out.println(list);
    }
}
