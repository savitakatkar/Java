import java.util.*;
public class Sub_Marks
{
    public static void main(String arg[])
    {
        int Subject1 = 0, Subject2 = 0, Subject3  = 0, Total = 0;
        float Per = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Marks in Subject 1 : ");
        Subject1 = sc.nextInt();

        System.out.print("\n Marks in Subject 2 : ");
        Subject2 = sc.nextInt();

        System.out.print("\n Marks in Subject 3 : ");
        Subject3 = sc.nextInt();

        Total = Subject1 + Subject2 + Subject3;

        Per = Total / 3;

        System.out.print("\n Total =  "+Total+" , Percentage = "+Per+" ");

        
    }
}