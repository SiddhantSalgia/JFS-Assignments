package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Employee
{
    private int id;
    private String name;
    private long salary;
    private String department;

    public Employee()
    {
        this.id=getId();
        this.name=getName();
        this.salary=getSalary();
        this.department=getDepartment();
    }

    public int getId()
    {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        return id;
    }

    public String getName()
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        return name;
    }

    public long getSalary()
    {
        Scanner sc = new Scanner(System.in);
        long salary = sc.nextLong();
        return salary;
    }

    public String getDepartment()
    {
        Scanner sc = new Scanner(System.in);
        String department = sc.next();
        return department;
    }

    public void displayDetails()
    {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);
        System.out.println(this.department);
    }
}

public class Question1 {

    public static void main(String[] args)
    {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee());
        employees.add(new Employee());
        employees.add(new Employee());
        System.out.println(employees);
    }
}
