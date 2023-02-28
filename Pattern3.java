import java.util.Scanner;
class Pattern3
{
	static void printPatternOneRow(char ch,int n)
	{
		for(int i=0;i<n;i++)
		{
          System.out.print(ch);
		}
		System.out.print("\n");
	}
	 static void printPatternDec(int nr,char ch)
	{
		for (int i=nr;i>0;i--)
		{
			printPatternDec(i,ch);
		}
	}
	static void printPatternInc(int nr,char ch)
	{
		for (int i=1;i<=nr;i++)
		{
			printPatternInc(i,ch);
		}
	}
		
        public static void main(String args[]) 
	{
			int n;char ch;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			n=sc.nextInt();
            System.out.println("Enter the Symbol:");
			ch=sc.next().charAt(0);
			if(n%2==0)
		{
				printPatternInt(n/2,c);
				printPatternDec(n/2,c);
		}
				else
		{
                    printPatternIn((int)(n/2),c);
				    printPatternDec((int)(n/2),c);
	}
	}
}
	


    
