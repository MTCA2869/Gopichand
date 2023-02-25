import java.util.Scanner;
public class Program304a
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		temp=a;
	    a=b;
		b=temp;
        System.out.println("Number after swapping:"+a+""+b);
    }
}
