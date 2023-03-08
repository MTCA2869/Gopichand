import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args) 
	{
		int n=0,i=0,a,b,c,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		c=n;
		a=n;
       while(a>0)
		{
		   a=a/10;
		   i++;
		}
		while(n>0)
		{
		b=n%10;
		sum=(int)(sum+Math.pow(b,i));
		n=n/10;
		}
		if(sum==c)
		{
		System.out.println(c+" is an Armstrong number");
	    }
		else
		{
			System.out.println(c+" is not an Armstrong number");
		}
	}
}
