import java.util.Scanner;
public class Program307a
{
	static double perimeter_of_a_circle(double perimeter)
	{
		return 2*Math.PI*perimeter;
	}
	public static void main(String args[]) 
	{
		double perimeter;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the perimeter of circle:");
		perimeter=sc.nextDouble();
		System.out.println("perimeter of the circle:"+perimeter_of_a_circle(perimeter));
	}
}


    
