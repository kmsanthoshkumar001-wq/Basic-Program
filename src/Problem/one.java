package Problem;

public class one
{
    public static void main(String[] args)
    {
        String a="HELLO";
        String b="HELLO";
        String c=new String("HELLO");

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c)); // checking content
    }
}
