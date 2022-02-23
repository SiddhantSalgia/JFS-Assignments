package com.company;

import java.util.ArrayList;

interface OddLengthRemove
{
    ArrayList<String> removeOddLength(ArrayList<String> employeeList);
}

public class Assignment4Q4
{
    public static void main(String[] args)
    {
        ArrayList<String> emp = new ArrayList<>();
        emp.add("Siddhant");
        emp.add("Amrit");
        emp.add("Nisarg");
        emp.add("Akshansh");
        emp.add("Shyam");
        emp.add("Shashank");
        OddLengthRemove olr = (employeeList)->
        {
            for(int i = 0;i<employeeList.size();i++)
            {
                if ((employeeList.get(i).length()%2)!=0)
                {
                    employeeList.remove(i);
                }
            }
            return employeeList;
        };
        System.out.println(olr.removeOddLength(emp));
    }
}
