import java.util.Scanner;
public class Program304d
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		a=(a*b)/(b=a);
        System.out.println("Number after swapping:"+a+""+b);
    }
}
