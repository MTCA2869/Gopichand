import java.util.Scanner;
class Program702
{
	public static int sumDigit(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum=sum+n%10;
				n=n/10;
		}//while
		return sum;
	}//sumDigit
	public static void main(String[] args)
	{
		Program702 Ob1=new Program702(); 
			Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
				int temp=sc.nextInt();
				int res=Ob1.sumDigit(temp);
				System.out.println("Sum of the digits of " +temp+ " is " +res);
	}//main()
}//Number