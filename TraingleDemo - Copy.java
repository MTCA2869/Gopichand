class Triangle
{
		private double base;
		private double height;
	public Triangle()
	{
		base=height=0.0;
	}
	public Triangle(double b,double h,)
	{
		base=b;
		height=h;
	}
	public void volume()
	{
		System.out.println("Volume="+(base*height));
	}
	}
	public class TriangleDemo
	{
        public static void main(String args[]) 
	{
		Triangle myTriangle1=new Triangle();
		Triangle myTriangle2=new Triangle(10,15,20);
		myTriangle1.volume();
		myTriangle2.volume();
	}
	}
	


    
