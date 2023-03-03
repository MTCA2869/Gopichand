import java.util.Scanner;
public class Testb
{
	public static void main(String[] args) 
	{
		double x1,y1,x2,y2,res;
		Scanner sc=new Scanner(System.in);
	  System.out.println("Enter x coordinate and y coordinate of a point:");
	  x1=sc.nextDouble();
	  y1=sc.nextDouble();
	  Point p=new Point(x1,y1);
	  res=p.distance_from_origin();
	  System.out.println("Distance of point from origin is "+res);
	}//main()
}//Test
