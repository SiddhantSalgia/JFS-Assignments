package com.company;

import java.util.Scanner;

class SiCi
{
    public double simpleInterest(double principleAmount,int time,double interestRate)
    {
        return ((principleAmount*interestRate*time)/100);
    }
    public double compoundInterest(double principleAmount,int time,double interestRate)
    {
        return (principleAmount*Math.pow((1+interestRate),time)-principleAmount);
    }
}

public class Assignment1Q3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        int t = sc.nextInt();
        SiCi obj = new SiCi();
        System.out.println(obj.simpleInterest(p,t,r));
        System.out.println(obj.compoundInterest(p,t,r));
    }
}
