import java.util.*;
public class Calculator
{
    public static void main(String[] args) 
    {
        int N1 = 0, N2 =0, Add = 0, Sub = 0, Mul = 0, Div = 0, Mod = 0;
        Scanner sc = new Scanner (System.in);

        System.out.print("\n Enter First Number: ");
        N1=sc.nextInt();
        System.out.print("\n Enter Second Number: ");
        N2=sc.nextInt();

       Add = N1 + N2;
       System.out.println("\n Addition of Two Numbers is : "+Add);
        
       Sub = N1 - N2;
       System.out.println("\n Substraction of Two Numbers is : "+Sub);
        
       Mul = N1 * N2;
       System.out.println("\n Multilpication of Two Numbers is : "+Mul);

       Div = N1 / N2;
       System.out.println("\n Division of Two Numbers is : "+Div);
       
       Mod = N1 % N2;
       System.out.println("\n Modulus of Two Numbers is : "+Mod);
        
       
    }
}