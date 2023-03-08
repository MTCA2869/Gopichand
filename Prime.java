import java.util.Scanner;
class Number  
{
	private int num;
	public void setNum(int num){this.num=num;}
	public int getNum(){return this.num;}
	public boolean checkPrime()
	{
		if(this.num==1 || this.num==2)return true;
		for(int i=2;i<this.num;i++)
		{
			if(this.num%i==0)return false;
		}//for
		return true;
	}
}//number
class Prime
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a no:");
		int temp=s.nextInt();
		Number ob1=new Number();
		ob1.setNum(temp);
		if(ob1.checkPrime())
			System.out.println("prime");
		else
			System.out.println("Not prime");
	}//main()
}//test
