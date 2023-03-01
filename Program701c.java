class MyDate 
{
	public int day;
	private int month;
	public int year;
	public int get_month()
	{
		return month;
	}//get_day()
	public void set_month(int m)
	{
		month=m;
	}//set_day()
}//Mydate
class Test2
{
	public static void main(String[] args) 
	{
		MyDate Ob1=new MyDate();
		//Ob1.day=13;
		Ob1.day=(10);
		Ob1.set_month(02);
		Ob1.year=2023;
		System.out.println(Ob1.day+"-"+Ob1.get_month()+"-"+Ob1.year);
	}//main()
}//Test
