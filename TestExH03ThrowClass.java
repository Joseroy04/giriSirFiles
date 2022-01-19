package testing;

public class TestExH03ThrowClass
{
static void demo()
{
	try
	{
		System.out.println("inside demo");
		throw new NullPointerException("exception data");
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	
}
}
