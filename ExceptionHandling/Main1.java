import java.util.Scanner;

class Question1
{
    public void divisionException(int num1,int num2)
    {
        try{
            System.out.println(num1/num2);
        }
        catch(ArithmeticException e){
            System.out.println("Error!! Can't divide by zero");
        }
    }
}

public class Main1 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int num1;
        int num2;
        num1=obj.nextInt();
        num2=obj.nextInt();
        Question1 dobj = new Question1();
        dobj.divisionException(num1,num2);
    }
}
