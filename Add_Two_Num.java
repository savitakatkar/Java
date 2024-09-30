import java.util.*;
public class Add_Two_Num
{
    public static void main(String[] args) 
    {
        int N1 = 0, N2 =0, Add = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print(" \n Enter Number 1 :");
        N1 = sc.nextInt();

        System.out.print(" \n Enter Number 2 :");
         N2 = sc.nextInt();

         Add = N1 + N2;
        
         System.out.println(" \n The result of adding "+N1+" and "+N2+" is : "+Add+" ");
    }
        
}