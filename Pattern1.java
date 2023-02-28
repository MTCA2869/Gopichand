import java.util.Scanner;
class Pattern1
{
	static void printPatternOneRow(char ch,int n)
	{
		for(int i=0;i<n;i++)
		{
          System.out.print(ch);
		}
		System.out.print("\n");
	}
	static void printPattern(int nr,char ch)
	{
		for (int i=1;i<=nr;i++)
		{
			printPatternOneRow(ch,i);
		}
	}
		
        public static void main(String args[]) 
	{
			int n;char ch;
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			ch=sc.next().charAt(0);
            printPattern(n,ch);
	}
	}
	


    
