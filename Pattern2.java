import java.util.Scanner;
class Pattern2
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
		for (int i=nr;i>0;i--)
		{
			printPatternOneRow(ch,i);
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
            printPattern(n,ch);
	}
	}
	


    
