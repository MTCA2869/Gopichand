class MyDate 
{
	private int day;
	public int month;
	public int year;
	public int get_day()
	{
		return day;
	}//get_day()
	public void set_day(int d)
	{
		day=d;
	}//set_day()
}//Mydate
class Test1
{
	public static void main(String[] args) 
	{
		MyDate Ob1=new MyDate();
		//Ob1.day=13;
		Ob1.set_day(10);
		Ob1.month=02;
		Ob1.year=2023;
		System.out.println(Ob1.get_day()+"-"+Ob1.month+"-"+Ob1.year);
	}//main()
}//Test
