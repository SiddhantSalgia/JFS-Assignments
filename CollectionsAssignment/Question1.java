import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

class ContactDetails implements Comparable<ContactDetails>
{
    private String name;
    private String e_mail;
    private String gender;

    public ContactDetails(String name, String e_mail, String gender)
    {
        super();
        this.name = name;
        this.e_mail = e_mail;
        this.gender = gender;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return e_mail;
    }
    public String getGender()
    {
        return gender;
    }

    public String toString()
    {
        return name+" "+e_mail+" "+gender;
    }

    public int compareTo(ContactDetails obj)
    {
        return this.getName().compareTo(obj.getName());
    }

}

class PhoneNumber implements Comparable<PhoneNumber>
{
    private long number;

    public PhoneNumber(long number)
    {
        super();
        this.number = number;
    }

    public long getNumber()
    {
        return number;
    }

    public String toString()
    {
        return String.valueOf(number);
    }

    public int compareTo(PhoneNumber obj)
    {
        return this.toString().compareTo(obj.toString());
    }


}

public class Question1
{
    public static void main(String[] args)
    {
        ContactDetails Sid = new ContactDetails("Siddhant", "sid@g.com", "Male");
        ContactDetails Nis = new ContactDetails("Nisarg", "nis@y.com", "Male");
        ContactDetails Kri = new ContactDetails("Kaori", "k35@h.com", "Female");

        PhoneNumber p1 = new PhoneNumber(9645962345l);
        PhoneNumber p2 = new PhoneNumber(9908456123l);
        PhoneNumber p3 = new PhoneNumber(9904856969l);

        Map<PhoneNumber, ContactDetails> map = new TreeMap<>();

        map.put(p1, Sid);
        map.put(p2, Nis);
        map.put(p3, Kri);


        Set<Entry<PhoneNumber, ContactDetails>> entrySet = map.entrySet();

        int index = 0;
        for (Entry<PhoneNumber, ContactDetails> currentEntry : entrySet)
        {
            System.out.println("Key at " + index + ":" + currentEntry.getKey());
            index++;
        }
        int index2 = 0;
        for (Entry<PhoneNumber, ContactDetails> currentEntry : entrySet)
        {
            System.out.println("Value at " + index2 + ":" + currentEntry.getValue());
            index2++;
        }


        for (Entry<PhoneNumber, ContactDetails> entry : map.entrySet())
        {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }
}
