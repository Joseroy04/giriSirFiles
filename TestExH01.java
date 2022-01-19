package testing;

public class TestExH01 
{

	
	public static void main(String[] args) 
	{
		int a=10;
		int b=5;
		int c=3;
		int x=0;
		String s1="";
		try
		{
			x=a/(b-c);
			s1 = args[2];
			
		}
		
		/*catch(ArithmeticException e)
		{
			System.out.println("division by zero");
			x=1;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("division by zero");
			s1="Testing";
		}*/
		catch(Exception e) {
			System.out.println(e);
			x=1;
			s1="Testing";
		}

		System.out.println(x+s1);
		}

	}


