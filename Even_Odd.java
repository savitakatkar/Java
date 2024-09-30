import java.util.*;
public class Even_Odd
{
    public static void main(String arg[])
    {
        int Num;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\n Enter Number: ");
        Num =obj.nextInt();

        if(Num%2==0)
        {
            System.out.print("\n This is Even Number");
        }
        else
        {
            System.out.print("\n This is Odd Number");

        }
    }
}