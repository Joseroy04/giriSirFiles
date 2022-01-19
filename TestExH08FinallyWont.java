package testing;

public class TestExH08FinallyWont {

	
	public static void main(String[] args) {
		try
		{
			int a=10;
			int b=2;
			int c = a/b;
			String str1 = args[0];
			System.out.println("hello");
			System.exit(2);
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block wont be executed");
		}
	}

}
