class TestOuter1a
{
	static int data=50;
	static class Inner
	{
		static void msg()
	{
			System.out.println("data is"+data);
	}//msg()
	}//inner
	public static void main(String[] args) 
	{
		TestOuter1a.Inner.msg();
	}//method()
}//main
