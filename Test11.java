package testing;

public class Test11 {
	public static void main(String[] args) {
		int i;
		int a,b;
		a = 100;
		b = 75;
		for(i=0;i<a;i=i+5) {
			try {	
				System.out.println(a/(b-i));
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Value of a is \t"+a);
	}

}
