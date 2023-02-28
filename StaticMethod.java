class  StaticMethod
{
	static void myStaticMethod()
	{
		System.out.println("Static methods can be called without creating object");
	}
			public void myPublicMethod()
	{
				System.out.println("Public methods must be called by creating object");
	}
	public static void main(String[] args) 
	{
		myStaticMethod();
		myPublicMethod();
		StaticMethod s=new StaticMethod();
		s.myPublicMethod();
	}
}

