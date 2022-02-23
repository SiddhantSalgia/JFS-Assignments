public class StringBufferAssignment
{
    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer();
        System.out.println(str);
        str.append("StringBuffer");
        str.append("is a peer class of String");
        str.append("that provides much of");
        str.append("the functionality of strings");
        System.out.println(str);
        StringBuffer str1 = new StringBuffer("It is used to at the specified index position");
        str1.insert(14,"insert text");
        System.out.println(str.toString());
        StringBuffer str2 = new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println(str2);
        str2.reverse();
        System.out.println(str2);
    }
}
