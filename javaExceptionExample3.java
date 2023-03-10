public class javaExceptionExample3
{
	public static void main(String[] args) 
	{
		try
		{
		 String s="abc";
		 int i=Integer.parseInt(s);
		}
		catch (Exception e)
		{
		System.out.println(e);
	}
	System.out.println("rest of the code...");
	}
}
