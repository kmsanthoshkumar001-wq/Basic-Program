package Problem;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        try(Scanner scan= new Scanner(System.in))
        {
            System.out.print("Enter Word:");

            String Word= scan.nextLine();

//            String Word="SAN";


            String [] arr = Word.split("");

            String rev="";


            for(int i=arr.length-1;i>=0;i--)
            {
                 rev=rev+Word.charAt(i);

            }

            if(Word.equals(rev))
            {
                System.out.print("Palindrome");
            }

            else
            {
                System.out.print("Not a Palindrome");

            }
        }

    }
}
