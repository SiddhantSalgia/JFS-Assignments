package com.company;

import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks)
    {
        String res = "failed";
        if((subject1Marks>60)||(subject2Marks>60)||(subject3Marks>60)){
            res = ("failed");
        }
        else if(((subject1Marks+subject2Marks)>60)||((subject2Marks+subject3Marks)>60 )||((subject3Marks+subject1Marks)>60)){
            res=("Passed"+"\n"+"promoted");
        }
        else if((subject1Marks+subject2Marks+subject3Marks)>60){
            res= ("passed");
        }
        return res;
    }
}

public class Assignment1Q4 {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        double subject1Marks = sc.nextDouble();
        double subject2Marks = sc.nextDouble();
        double subject3Marks = sc.nextDouble();
        ResultDeclaration obj = new ResultDeclaration();
        System.out.println(obj.declareResults(subject1Marks,subject2Marks,subject3Marks));
    }
}
