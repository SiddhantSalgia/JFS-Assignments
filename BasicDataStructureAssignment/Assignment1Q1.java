import java.util.Scanner;

class Question1{
    public boolean armstrongOrNOt(int num){
        int r,sum=0,temp;
        for(temp=num;num!=0;num=num/10)
        {
            r=num%10;
            sum=sum+(r*r*r);
        }
        return (sum==temp);
    }
}

public class Assignment1Q1 {

    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        Question1 obj = new Question1();
        System.out.println(obj.armstrongOrNOt(num));
    }
}
