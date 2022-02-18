package com.company;

class Question2
{
    public void armstrongInGivenRange(int num1,int num2)
    {
        int r,sum,temp;
        for(int i=num1;i<=num2;i++)
        {
            temp=i;
            sum=0;
            while (temp!=0)
            {
                r=temp%10;
                temp=temp/10;
                sum=sum+(r*r*r);
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }
        System.out.println(" ");
    }
}

public class Assignment1Q2 {
    public static void main(String[] arg)
    {
        int num1=100,num2=999;
        Question2 obj = new Question2();
        obj.armstrongInGivenRange(num1,num2);
    }
}
