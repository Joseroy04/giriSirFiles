package testing;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,i;
		a=100;b=300;c=450;
		int sum=1;
		if(a>b)
		{
			if(a>c) {
				System.out.println("A");
			}
			else {
				System.out.println("C");
				
			}
		}
		else {
			if(b>c) {
				System.out.println("B");
				
			}
			else {
				System.out.println("C");
			}
		}
		for(i=1;i<=5;i++) {
			System.out.println("Print "+i);
			sum=sum*i;
		}
		i--;
		System.out.println("Factorial of "+i+ "\t:\t"+sum);
	}

}
