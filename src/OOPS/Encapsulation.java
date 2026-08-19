package OOPS;

class person
{
    private int balance=2000;

    public void setter(int balances)
    {
        balance=balances+balance;
    }

    int getter()
    {
        return balance;
    }
}

public class Encapsulation
{

    public static void main(String[] args)
    {
        person p= new person();

        p.setter(1000);
        System.out.println("Balance:"+p.getter());
    }

}
