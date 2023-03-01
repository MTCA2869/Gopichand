import java.util.Scanner;
class Numbers
{
   private int n1;
	   public void setn1(int n1)
	   {
		this.n1=n1;
	   }//setn1
	   public int getn1()
	{
		   return this.n1;
	} //getn1
	public int sumDigit()
	{
		int sum=0;
		int n=this.n1;
		while(n>0)
		{
			sum=sum+n%10;
				n=n/10;
		}//while
		return sum;
	}//sumDigit
}//Numbers
class Number
{
	public static void main(String[] args)
	{
		Numbers Ob1=new Numbers(); 
			Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
				int temp=sc.nextInt();
                Ob1.setn1(temp);
				int res=Ob1.sumDigit();
				System.out.println("Sum of the digits of"+Ob1.getn1()+"is"+res);
	}//main()
}//Number