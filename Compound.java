import java.util.Scanner;
class Compound
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double principal,rate,time;
		principal=sc.nextDouble();
		rate=sc.nextDouble();
		time=sc.nextDouble();
		double CI=principal*(Math.pow((1+rate/100),time));
		System.out.println("Compound interest is ="+CI);
	}
}
