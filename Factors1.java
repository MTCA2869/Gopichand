import java.util.Scanner;
class Factors1 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter a numbers:");
		num=sc.nextInt();
		int i,count=0;
		System.out.print("\nTotal factors of "+num+"are:");
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count=count+1;
				System.out.print(i+" ");
			}
		}
		System.out.print("\nTotal factors of "+num+" : " +count);
	}
}
