package testing;

public class TestExH01a_PrintDemo
{

	
	public static void main(String[] args) 
	{
		int x=0;
		try
		{
			x=1/0;
		}
	catch(ArithmeticException e)
	{
		System.out.println(e);
		System.out.println("***********************");
		e.printStackTrace();
		System.out.println("***********************");
		System.out.println(e.getMessage());
		System.out.println("***********************");
	}
		System.out.println(x);

	}

}
