package testing;

public class TestExH05NestedTry 
{

	public static void main(String[] args) 
	{
		try
		{
		int a=Integer.parseInt(args[0]);
		try
		{
		int b=Integer.parseInt(args[1]);
		System.out.println(a/b);
		}


		catch(ArithmeticException e)
		{
		System.out.println(e);
		}
		}
		catch(NumberFormatException e1)
		{
		System.out.println(e1);
		}


	}

}
