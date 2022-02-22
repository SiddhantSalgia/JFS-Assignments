package com.company;

import java.util.*;

class CurrentAccount extends Assignment2Q3
{
    int totalDeposits = 10000;
    int creditLimit = 2000;
    public CurrentAccount(String accountName)
    {
        super(accountName);
    }
    public int cashWithdraw(int amount)
    {
        if(getCash()>amount)
        {
            totalDeposits=totalDeposits-amount;
            return -(amount);
        }
        else if((getCash()+creditLimit)>amount)
        {
            this.creditLimit-= amount-totalDeposits;
            totalDeposits=totalDeposits-amount;
            return -(amount);
        }
        else
            return 0;
    }
    public int getCash()
    {
        return totalDeposits;
    }
}
class SavingsAccount extends Assignment2Q3
{
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    public SavingsAccount(String accountName)
    {
        super(accountName);
    }
    public int getCash()
    {
        return fixedDepositAmount+totalDeposits;
    }
    public int cashWithdraw(int amount)
    {
        if(getCash()>amount)
        {
            totalDeposits-=amount;
            return -(amount);
        }
        else
            return 0;
    }
}

public class Assignment2Q3
{
    static ArrayList<Integer> totalCashInBank;
    private String name;
    protected int totalDeposits=0;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public Assignment2Q3(String accountName)
    {
        this.setName(name);
    }

    public int deposit(int amount)
    {
        this.totalDeposits+=amount;
        return amount;
    }

    public int cashWithdraw(int amount)
    {
        if (totalDeposits > amount)
        {
            totalDeposits -= amount;
            return -amount;
        }
        else
        {
            return 0;
        }
    }

    public static int totalCashInBank(ArrayList<Integer> cash)
    {
        int total = 0;
        for(int i =0;i<cash.size();i++)
        {
            total += cash.get(i);
        }
        return total;
    }
    public int getCash()
    {
        return totalDeposits;
    }
    public static void main(String[] args)
    {
        totalCashInBank = new ArrayList<Integer>();
        Assignment2Q3 account1 = new SavingsAccount("acc1");
        Assignment2Q3 account2 = new CurrentAccount("acc2");
        SavingsAccount account3 = new SavingsAccount("acc3");
        CurrentAccount account4 = new CurrentAccount("acc4");
        totalCashInBank.add(account1.deposit(200));
        totalCashInBank.add(account2.deposit(4000));
        totalCashInBank.add(account3.deposit(600));
        totalCashInBank.add(account4.deposit(400));
        totalCashInBank.add(account3.cashWithdraw(500));
        totalCashInBank.add(account2.cashWithdraw(6300));
        System.out.println(totalCashInBank(totalCashInBank));
    }
}
