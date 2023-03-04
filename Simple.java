import java.util.Scanner;
class Simple
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		float P,R,T;
		P=sc.nextFloat();
		R=sc.nextFloat();
		T=sc.nextFloat();
		float SI=(P*T*R)/100;
		System.out.println("Simple interest= "+SI);
	}
}
