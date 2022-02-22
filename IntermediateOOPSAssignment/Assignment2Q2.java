package com.company;

import java.util.*;

class Manager extends Assignment2Q2
{
    Manager(int id, int salary)
    {
        super(id, salary);
    }
    public int getSalary(int salary )
    {
        int incentive = 10000;
        salary += incentive;
        salaryEarned += salary;
        salaries.add(salaryEarned);
        return (salary);
    }
}
class Labour extends Assignment2Q2
{
    Labour(int id, int salary)
    {
        super(id, salary);
    }
    public int getSalary(int salary)
    {
        int overtime = 1000 ;
        int salaryForHours = (salary/365)/9;
        salary += (salaryForHours*1.5)*overtime;
        return salary;
    }
}
public  class Assignment2Q2
{
    int salary=10000;
    int salaryEarned = 0 ;
    int id;
    static int total;
    static List<Integer> salaries;
    Assignment2Q2(int id ,int salary)
    {
        this.id = id ;
        this.salary = salary;
        salaryEarned = 0;
    }
    public int getSalary(int salary)
    {
        return salary;
    }
    public  int salaryRecieved()
    {
        salary = getSalary(salary);
        salaryEarned += salary;
        return salaryEarned;
    }
    public static int totalEmployeesSalary(List<Integer> employeeSalaries)
    {
        int i;
        for(i =0;i<employeeSalaries.size();i++)
        {
            total += employeeSalaries.get(i);
        }
        return total;
    }
    public static void main(String[] args)
    {
        salaries = new ArrayList<>();
        Assignment2Q2 employee1 = new Assignment2Q2(1,30000);
        Assignment2Q2 employee2 = new Assignment2Q2(2,70000);
        Manager employee3 = new Manager(2,70000);
        Labour employee4 = new Labour(2,12000);
        salaries.add(employee1.salaryRecieved());
        salaries.add(employee2.salaryRecieved());
        salaries.add(employee3.salaryRecieved());
        salaries.add(employee4.salaryRecieved());
        System.out.println(totalEmployeesSalary(salaries));
    }

}