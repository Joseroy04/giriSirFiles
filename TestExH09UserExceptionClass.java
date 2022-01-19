package testing;

import java.io.*;

class BadString extends RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
public class TestExH09UserExceptionClass 
{

	
	public static void main(String[] args) 
	{
		try{
            System.out.println("Enter the String: ");
            BufferedReader sb=new BufferedReader(new InputStreamReader(System.in));
            String s=sb.readLine();
            if(s.equals("hateyou"))
            {
                throw new BadString();
            }
            System.out.println("I Accept your String");
        }
		catch(Exception e)
		{
            System.out.println("Please enter a good String");
        }

	}

}
