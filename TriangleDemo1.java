class Triangle
{
		double base;
		double height;
	}
	class TriangleDemo1
	{
	public static void main(String args[]) 
	{
		Triangle mytriangle=new Triangle();
		double area;
		mytriangle.base=100;
		mytriangle.height=180;
		area=0.5*mytriangle.base*mytriangle.height;
		System.out.println("Area is"+area);
	}
	}
