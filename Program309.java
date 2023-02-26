import java.util.Scanner;
public class Program309
{
	static int smallest_among_three(int a,int b,int c)
	{
		if (a<b&&a<c)
		return a;
		else if(b<a&&b<c)
			return b;
		else if(c<a&&c<b)
			return c;
		return 0;
	}
	public static void main(String args[]) 
	{
		int a,b,c;
        System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int min=smallest_among_three(a,b,c);
			System.out.println("The smallest among the three numbers is "+min);
	}
}


    
