import java.util.Scanner;
public class FactorsArray1 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter a numbers:");
		num=sc.nextInt();
		int size=(int)num/2;
		int[] FA=new int[size];
		int i,count=0;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				FA[count]=i;
				count=count+1;
			}
		}
		System.out.print("\nTotal factors of "+num+" is " +count+" : ");
		for(int j=0;j<count;j++)
			System.out.print(FA[j]+" ");
	}
}
