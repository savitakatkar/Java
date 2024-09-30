import java.util.*;
public class Area_of_Circle
{
    public static void main(String[] args) 
    {
        float Radius = 0;
        double Area = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter Radius : ");
        Radius = sc.nextFloat();

        Area = 3.14 * Radius * Radius ;

        System.out.println("\n Area of Circle is : "+ Area +" ");
        
    }
}