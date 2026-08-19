package OOPS;

abstract class remote
{
    abstract void turnOn();
    abstract void  turnOff();


}
class Televison extends remote
{


    public void turnOn()
    {
        System.out.println("TV Turn ON");
    }
    public void turnOff()
    {
        System.out.println("TV Turn OFF");
    }

}

public class Abstraction {

    public static void main(String[] args)
    {
        Televison tv= new Televison();
        tv.turnOn();
        tv.turnOff();

    }

}