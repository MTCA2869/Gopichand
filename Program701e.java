class MyDate 
{
	private int day;
	private int month;
	private int year;
	public int get_day()
	{
		return day;
	}//get_day()
	public int get_month()
		{
		return month;
		}//get_month()
	public int get_year()
	{
		return year;
	}//get_year()
	public void set_day(int d)
	{
		day=d;
	}//set_day()
	public void set_month(int m)
	{
		month=m;
	}//set_month
	public void set_year(int y)
	{
		year=y;
	}//set_year()
}//Mydate
class Test4
{
	public static void main(String[] args) 
	{
		MyDate Ob1=new MyDate();
		Ob1.set_day(13);
		Ob1.set_month(01);
		Ob1.set_year(2002);
		System.out.println(Ob1.get_day()+"-"+Ob1.get_month()+"-"+Ob1.get_year());
	}//main()
}//Test
