import java.util.Scanner;
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
class Test5
{
	public static void main(String[] args) 
	{
		int day,month,year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day:");
		day=sc.nextInt();
        System.out.println("Enter the month:");
		month=sc.nextInt();
		System.out.println("Enter the year:");
		year=sc.nextInt();
		System.out.println(day+"-"+month+"-"+year);
	}//main()
}//Test
