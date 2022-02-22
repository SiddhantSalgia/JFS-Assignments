import java.util.Objects;

class SingletonInheritanceCheck
{
    public static void Check(Assignment2Q1 A,Assignment2Q1 B)
    {
        if(Objects.equals(A,B))
        {
            System.out.println("Singleton Inheritance Authenticated");
        }
        else
        {
            System.out.println("Error");
        }
    }
}

class Assignment2Q1
{
    private static Assignment2Q1 instance;
    public String string;
    private Assignment2Q1()
    {
        System.out.println("It's Singleton Class");
    }

    public static Assignment2Q1 getInstance()
    {
        if(instance == null){instance = new Assignment2Q1();}
        return instance;
    }
    public static void main(String[] args)
    {
        Assignment2Q1 str1 = Assignment2Q1.getInstance();
        Assignment2Q1 str2 = Assignment2Q1.getInstance();
        System.out.println(str1);
        System.out.println(str2);
        SingletonInheritanceCheck.Check(str1,str2);
    }
}


