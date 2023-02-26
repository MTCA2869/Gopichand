import java.util.Scanner;
public class Program310
{
	public static void main(String args[]) 
	{
		int a,b,c;
        System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int max=0;
		max=((a>b&&a>c)?a:(b>a&&b>c)?b:(c>a&&c>b)?c:a);
			System.out.println("The largest among the three numbers is "+max);
	}
}


    
