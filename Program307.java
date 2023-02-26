import java.util.Scanner;
public class Program307
{
	static double area_of_a_circle(double radius)
	{
		return Math.PI*radius*radius;
	}
	public static void main(String args[]) 
	{
		double radius;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the radius of circle:");
		radius=sc.nextDouble();
		System.out.println("Area of the circle:"+area_of_a_circle(radius));
	}
}


    
