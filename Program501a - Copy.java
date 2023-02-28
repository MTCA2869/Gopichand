import java.util.Scanner;
public class Program501a
{
	static double area_of_a_rectangle(double l, double b)
	{
		return l*b;
	}
	public static void main(String args[]) 
	{
		double l,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the length bearth of rectangle:");
		l=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Area of the rectangle:"+area_of_a_rectangle(l,b));
	}
}