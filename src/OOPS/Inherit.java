package OOPS;

class Animal
{
    void display()
    {
        System.out.print("Animal");

    }}

class cat extends Animal{

    void display()
    {
        System.out.print("Cat");

    }
}

class Dog extends Animal{

    void display()
    {
        System.out.print("DOG");

    }
//    System.out.print("Dog");
}

public class Inherit
{
    public static void main(String[] args)
    {
        cat a= new cat();

        a.display();
    }
}
