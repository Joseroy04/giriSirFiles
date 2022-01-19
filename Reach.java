
public class Reach 
{

	
	public static void main(String[] args) 
	{
		int a=10;
		int b=5;
		int c=5;
		int x;
		try
		{
			x=a/(b-c);
			
		}
		catch(Exception e)
		{
			System.out.println("unreachable problem");
		}
		
		catch(ArithmeticException e1)
		{
			System.out.println("division by zero");
		}

	}

}
