import java.util.Scanner;
class else_example1
{
	public static void main(String args[]) 
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		j=sc.nextInt();
		if(j==0)
			System.out.println("Division by error");
		else
			System.out.println(i+"division"+j+"is"+(i/j));
	}
}


    
