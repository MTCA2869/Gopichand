import java.util.Scanner;
public class Program310a
{
	public static void main(String args[]) 
	{
		int a,b,c;
        System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int min=0;
		min=((a<b&&a<c)?a:(b<a&&b<c)?b:(c<a&&c<b)?c:a);
			System.out.println("The smallest among the three numbers is "+min);
	}
}


    
