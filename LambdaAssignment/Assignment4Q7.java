package com.company;
import java.util.*;
import java.util.function.Consumer;

public class Assignment4Q7
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("XY",1);
        map.put("LD",2);
        map.put("LM",3);
        map.put("QW",4);
        map.put("ZY",5);

        Assignment4Q7 Lam = new Assignment4Q7();
        Lam.convertKeyValueToString(map);
    }

    public String convertKeyValueToString(HashMap<String,Integer> map)
    {
        StringBuilder str = new StringBuilder();
        Consumer<Map.Entry> consumer = (p)->str.append(p.getKey()).append(p.getValue());
        Set s = map.entrySet();
        s.stream().forEach(consumer);
        System.out.println(str);
        return str.toString();
    }

}
