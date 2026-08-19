package OOPS;


class Person

{
    void UPI()
    {
        System.out.println("UPI MODE");
    }

    void NetBanking()
    {
        System.out.print("NetBanking");
    }
}

public class polymorphism_run
{
    public static void main(String[] args)
    {
        Person p =new Person();

        p.UPI();
    }
}

