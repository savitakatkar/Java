import java.util.*;
public class Area_of_Rectangle
{
    public static void main(String[] args) 
    {
        float Height = 0, Width = 0;
        double Area = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter Height : ");
        Height = sc.nextFloat();

        System.out.print("\n Enter Width : ");
        Width = sc.nextFloat();

        Area = Height * Width;

        System.out.println("\n Area of Circle is : "+ Area +" ");
        
    }
}