class MyDate 
{
	public int day;
	public int month;
	public int year;
}//class
class Test
{
	public static void main(String[] args) 
	{
		MyDate Ob1=new MyDate();
		Ob1.day=13;
		Ob1.month=01;
		Ob1.year=2023;
		System.out.println(Ob1.day+"-"+Ob1.month+"-"+Ob1.year);
	}//main()
}//class
