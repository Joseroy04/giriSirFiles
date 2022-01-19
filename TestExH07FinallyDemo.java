package testing;

public class TestExH07FinallyDemo 
{

	
	public static void main(String[] args) 
	{
		 try
		 {
		int a=10;
		int b=5;
		int c=3;
		int x=a/(b-c);
		 }
		catch(ArithmeticException e)
		{
			System.out.println("division by zero");
		}
		finally
		{
			System.out.println("always executed");
		}

	}

}
