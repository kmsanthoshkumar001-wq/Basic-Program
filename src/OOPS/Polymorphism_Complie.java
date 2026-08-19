package OOPS;


class calculator

{
    void display(int a, int b)
    {
        System.out.println("Value:"+(a+b));
    }

    void display(int a, int b,int c)
    {
        System.out.print("Value:"+(a+b+c));
    }
}

public class Polymorphism_Complie
{
    public static void main(String[] args)
    {
        calculator c= new calculator();

        c.display(10,5);

        c.display(10,5,5);
    }
}
