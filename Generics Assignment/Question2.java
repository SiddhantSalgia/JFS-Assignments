package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        HashMap<Integer, Double> hashObj = new HashMap<Integer, Double>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            hashObj.put(i+1, sc.nextDouble());
        }
        System.out.println(hashObj);
    }
}
