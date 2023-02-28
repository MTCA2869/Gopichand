import java.util.Scanner;
public class Program501
{
	static double area_of_a_triangle(double base, double height)
	{
		return 0.5*base*height;
	}
	public static void main(String args[]) 
	{
		double base,height;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the base height of triangle:");
		base=sc.nextDouble();
		height=sc.nextDouble();
		System.out.println("Area of the triangle:"+area_of_a_triangle(base,height));
	}
}


    
