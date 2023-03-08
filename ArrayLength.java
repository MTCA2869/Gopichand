import java .util.Scanner;
class Number
{
	private int num;
	public void setNum(int num){this.num=num;}
	public int getNum(){return this.num;}
	public int checkLength()
	{
		int n=this.num;
		if(n<0)n=-n;
		if(n==0)return 1;
		int len=0;
		while (n>0)
		{
			n=n/10;
			len++;
		}
		return len;
	}//checklength
}//number
class ArrayLength
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a no:");
		int temp=s.nextInt();
		Number ob=new Number();
		ob.setNum(temp);
		System.out.println("\n"+ob.checkLength());
	}//main
}//ArrayLength
