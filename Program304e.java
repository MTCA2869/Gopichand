import java.util.Scanner;
public class Program304e
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a*b;
		b=a/b;
		a=a/b;
        System.out.println("Number after swapping:"+a+""+b);
    }
}
