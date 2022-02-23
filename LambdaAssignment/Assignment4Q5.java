package com.company;

import java.util.ArrayList;

public class Assignment4Q5
{
    private static StringBuilder charBuffer = new StringBuilder();

    interface ProcessWords
    {
        String processWords(ArrayList<String> input);
    }

    public static void main(String[] args)
    {
        //String input = "alpha bravo charlie delta echo foxtrot";
        ArrayList<String> obj = new ArrayList<>();
        obj.add("alpha");
        obj.add("bravo");
        obj.add("charlie");
        obj.add("delta");
        obj.add("echo");
        obj.add("foxtrot");
        ProcessWords pw = (str)->
        {
            for(String values:str)
            {
                charBuffer.append(values.charAt(0));
            }
            return charBuffer.toString();
        };
        System.out.println(pw.processWords(obj));
    }
}
