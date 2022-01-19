package testing;

public class Test10 {

	public static void main(String[] args) {

		String s1="",s2="",s3="";
		s1 = args[0];
		s2=args[1];
		try {
		s3=args[2];
		}
		catch (ArithmeticException msg) {
			System.out.println("Arithmetic Exception \t:"+msg);
			s3="";
		}
		catch (NullPointerException msg)
		{
			System.out.println("Null Exception \t:"+msg);
			s3="";
		}
		catch (ClassNotFoundException msg) {
			System.out.println("Class Not found Exception \t:"+msg);
			s3="";
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndex Exception \t:"+e);
			s3="";
		}
		catch (Exception exc) {
			System.out.println("Exception class \t:"+exc);
			s3="";
		}
		
		}
		int len1=s1.length();
		int len2=s2.length();
		int len3=s3.length();
		if(len1>len2 && len1> len3) {
			System.out.println(s1+" is longest");
		}
		else if (len2>len3 && len2>len1){
			System.out.println(s2+" is longest");
		}
		else if (len3>len2 && len3>len1){
			System.out.println(s3+" is longest");
		}
	}
}
