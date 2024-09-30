import java.util.*;
public class Prime_Number
{
    public static void main(String arg[])
    {
        int N = 0, i =0, Count = 0;
        Scanner sc = new Scanner (System.in);

        System.out.print("\n Enter number : ");
        N = sc.nextInt();

        for( i = 2; i<N; i++)
        {
            if(N % i == 0)
            {
            Count++;
            break;
            }

        }

        if(Count == 0)
        {
            System.out.println("Prime");
            
        }

        else
        {
            System.out.println("Not Prime");
            
        }
    }
}