import java.util.Scanner;
class Number
{
	private int num;
	public void setNum(int num)
	{this.num=num;}
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
}//Number
class ArrayPrime
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter a no:");
		int size=s.nextInt();
		int[]numList=new int[size];
		int[]numPrime=new int[size];
		System.out.println("Enter "+size+" nos:");
		for(int i=0;i<size;i++)
		{
			numList[i]=s.nextInt();
		}//for
        Number ob1=new Number();
		for(int i=0;i<size;i++)
		{
			ob1.setNum(numList[i]);
			if(ob1.checkPrime())
			{
				numPrime[i]=ob1.getNum();
				count++;
			}
			else
			{
				numPrime[i]=0;
			}
		}//for
		for(int i=0;i<size;i++)
		{
			if(numPrime[i]!=0)
				System.out.print(numPrime[i]+",");
		}
		System.out.print("\n Total prime numbers in input array is "+count);
	}//main
}//ArrayPrime
