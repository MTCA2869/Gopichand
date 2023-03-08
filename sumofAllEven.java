import java.util.Scanner;
public class sumofAllEven
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sumEven=0;
		System.out.println("Enter 10 array elements");
		int Arr[]=new int[10];
		for(int i=0;i<Arr.length;i++)
			Arr[i]=sc.nextInt();
		for(int j=0;j<Arr.length;j++)
		{
			if(Arr[j]%2==0)
			{
				sumEven=sumEven+Arr[j];
	}
}
System.out.println("Sum of all Even numbers:"+sumEven);
	}
}
