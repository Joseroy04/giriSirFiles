package testing;

public class TestExH10c_UserRegistration 
{

public void profile(String country,int age)throws TestExH10a_InvalidAgeException,TestExH10b_InvalidCountryException

{
	if(!"India".equals(country))
	{
		throw new TestExH10b_InvalidCountryException("user outside india cannot be registered");
			}
	if(age<18)
	{
		throw new TestExH10a_InvalidAgeException("user age is not eligible");
		
	}
}
	public static void main(String[] args) 
	{
		TestExH10c_UserRegistration r=new TestExH10c_UserRegistration();
		try
		{
			r.profile("India",19);
			
		}
		catch(TestExH10a_InvalidAgeException i)
		{
			System.out.println(i.getMessage());
		}
		
		catch(TestExH10b_InvalidCountryException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
