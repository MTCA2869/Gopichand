import java.util.Scanner;
class Sum
{
	private int n;
	public void set(int n)
	{this.n=n;}
	public int get(){return n;}
	public int digit()
	{
     int sum=0;
     while(n>0) 
		{
		 sum=sum+n%10;
		 n=n/10;
	}//while
		 return sum;
	}//digit
		}//Number
class ArraySum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1;
		System.out.println("Enter a no:");
	    n1=sc.nextInt();
		int[] ar=new int[n1];
		int[] Sum=new int[n1];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n1;i++)
		{
			ar[i]=sc.nextInt();
		}//for
		Sum s=new Sum();
		for(int i=0;i<n1;i++)
		{
			s.set(ar[i]);
			int res=s.digit();
		System.out.print("\n The sum of the digits is: "+res);
		}//for
	}//main
}//ArrayPrime