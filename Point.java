import java.util.Scanner;
public class Point
{ 
	 private double x;
   private double y;
   public double getX()
	{return this.x;}
   public double getY()
	{return this.y;}
	Point()
	{
		x=0;
		y=0;
	}//point()
	Point(double x1,double y1)
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
class Test3
{
	public static void main(String[] args) 
	{
	  double x1,y1,x2,y2;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter x coordinate and y coordinate of a point:");
	  x1=sc.nextDouble();
	  y1=sc.nextDouble();
	  Point p=new Point(x1,y1);
	 // res=p.distance_from_origin();
	 // Point1 ob=new Point1();
	// res=ob.distance_from_origin();
	 // System.out.println("Distance of point from origin is "+res);
	  System.out.println("Enter x coordinate and y coordinate");
       System.out.println("for translation point:");
	  x2=sc.nextDouble();
	  y2=sc.nextDouble();
	 // Point q=new Point(x2,y2);
	 // res=p.distance_from_point(q);
      System.out.println("co-ordinate point is "+p.getX()+" , "+p.getY());
	   System.out.println("After translation:");
		   p.translate(x2,y2);
       System.out.println("co-ordinate point is "+p.getX()+" , "+p.getY());
	}//main()
}//Test

