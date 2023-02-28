class rectangle
{
		private double length;
		private double bearth;
	public rectangle()
	{
		length=bearth=0.0;
	}
	public rectangle(double l,double b)
	{
		length=l;
		bearth=b;
	}
	public void area()
	{
		System.out.println("Area="+(length*bearth));
	}
	public void perimeter()
	{
        System.out.println("Perimeter="+(2*length*bearth));
	}
}
	public class RectangleDemo
	{
        public static void main(String args[]) 
	{
		rectangle myrectangle1=new rectangle();
		rectangle myrectangle2=new rectangle(10,22);
		myrectangle1.area();
		myrectangle2.area();
		myrectangle1.perimeter();
		myrectangle2.perimeter();
	}
	}
	


    
