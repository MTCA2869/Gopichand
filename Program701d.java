class MyDate 
{
	public int day;
	public int month;
	private int year;
	public int get_year()
	{
		return year;
	}//get_day()
	public void set_year(int y)
	{
		year=y;
	}//set_day()
}//Mydate
class Test3
{
	public static void main(String[] args) 
	{
		MyDate Ob1=new MyDate();
		//Ob1.day=13;
		Ob1.day=(10);
		Ob1.month=(02);
		Ob1.set_year(2023);
		System.out.println(Ob1.day+"-"+Ob1.month+"-"+Ob1.get_year());
	}//main()
}//Test
