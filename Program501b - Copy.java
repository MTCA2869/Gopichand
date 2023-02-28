import java.util.Scanner;
public class Program501b
{
	static double calculateArea(double base, double height)
	{
		double temp;
		temp=1.0/2*base*height;
		return temp;
	}
	public static void main(String args[]) 
	{
		double base,height,area;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base of the right angled triangle:");
		base=sc.nextDouble();
		System.out.print("Enter the height of the right angled triangle:");
		height=sc.nextDouble();
		area=calculateArea(base,height);
		System.out.println("Area of the triangle with base"+base+"height"+height+"is"+area+"sq units");
	}
}


    
