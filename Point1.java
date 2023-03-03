import java.util.Scanner;
public class Point1
{ 
	double x;
    double y;
	Point1()
	{
		x=1;
		y=1;
	}//point()
	Point1(double x1,double y1)
	{
		x=x1;
		y=y1;
	}//point
	public double distance_from_origin()
	{
		double dist;
		dist=Math.sqrt(x*x+y*y);
		return dist;
	}//distance-from-origin
	public double distance_from_point(Point Q)
	{
		double diff_x=x-Q.x;
         double diff_y=y-Q.y;
		 return Math.sqrt(diff_x*diff_x+diff_y*diff_y);
	}//distance-from_point
	public void translate(double x_trans,double y_trans)
	{
		x=x+x_trans;
		y=y+y_trans;
	}//translate
}// class point
//public 
class Test1
{
	public static void main(String[] args) 
	{
		double x1,y1,x2,y2,res;
		Scanner sc=new Scanner(System.in);
	 // System.out.println("Enter x coordinate and y coordinate of a point:");
	 // x1=sc.nextDouble();
	//  y1=sc.nextDouble();
	 // Point p=new Point(x1,y1);
	 // res=p.distance_from_origin();
	  Point1 ob=new Point1();
	 res=ob.distance_from_origin();
	  System.out.println("Distance of point from origin is "+res);
	}//main()
}//Test

