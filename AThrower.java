
public class AThrower 
{

	
	public static void main(String[] args) 
  	{
	try
	{
		doWork();
	
	}
catch(ArithmeticException e)
{
	System.out.println("caught in main:"+e);
}

	}
static void doWork()
{
	try
	{
		throw new ArithmeticException("exception!");
		
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("caught inside doWork:"+e);
     throw e;
	}

}

}
