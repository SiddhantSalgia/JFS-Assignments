interface Addition
{
    double addition(int num1,int num2);
}

interface Subtraction
{
   double subtraction(int num1,int num2);
}

interface Multiplication
{
    double multiplication(int num1,int num2);
}

interface Division
{
    double division(int num1,int num2);
}

public class Assignment4Q1
{

    public static void main(String[] args)
    {
        int x=10,y=2;
        Addition aob = (a,b)->a+b;
        double ans1 = aob.addition(x,y);
        Subtraction sob = (a,b)->a-b;
        double ans2 = sob.subtraction(x,y);
        Multiplication mob = (a,b)->a*b;
        double ans3 = mob.multiplication(x,y);
        Division dob = (a,b)->a/b;
        double ans4 = dob.division(x,y);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    }
}
