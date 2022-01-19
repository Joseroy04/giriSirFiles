package testing;

public class TestExH02 
{

	
	public static void main(String[] args) 
	{
		int a[]={10,20};
		int b=30,x=0;
		try
		{
			x=a[2]/b-a[1];
		}
		catch(ArithmeticException e)
		{
		System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
		System.out.println(e1);
		}
		System.out.println(x);

	}
	}


