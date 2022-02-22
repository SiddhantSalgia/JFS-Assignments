package com.company;
import java.util.Scanner;

class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String str)
    {
        super(str);
    }
}

class IllegalBankTransactionException extends InsufficientBalanceException
{

    public IllegalBankTransactionException(String str)
    {
        super(str);
    }
}

class  savingAccount
{
    private final long id ;
    private double balance  ;

    public savingAccount(long id,double balance)
    {
        this.id=id;
        this.balance=balance;
    }

    public  double withdraw(double amount) throws RuntimeException
    {
        try
        {
            if(balance<amount)
            {
                throw new InsufficientBalanceException ("Insufficient balance in account");
            }
            balance -= amount ;
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
        return  balance ;
    }

    public  double deposit(double amount) throws RuntimeException
    {
        try
        {
            if(amount<=0)
            {
                throw new IllegalBankTransactionException("The amount should always be greater than 0");
            }
            balance -= amount ;
        }
        catch (IllegalBankTransactionException ez)
        {
            System.out.println(ez.getMessage());
        }
        return amount;

    }
    public  double getBalance()
    {
        return  balance ;
    }
    public long getId()
    {
        return id;
    }
}

public class Main3
{
    public static void main(String[] args)
    {
        savingAccount object = new savingAccount(33,23000);
        object.deposit(230.5);
        object.withdraw(46.3);
        System.out.println(object.getBalance());
    }
}
