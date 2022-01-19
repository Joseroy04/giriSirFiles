package testing;


class Calc{
	int a,b;

	public Calc(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	int sum(){
		return a+b;
	}
	int sub(){
		return a-b;
	}
	int mul() {
		return a*b;
	}
	int div() {
		return a/b;
	}
	int mod() {
		return a%b;
	}
	void printval() {
		System.out.println("Sum"+sum());
		System.out.println("Sub"+sub());
		System.out.println("mul"+mul());
		System.out.println("div"+div());
		System.out.println("mod"+mod());
	}
}
public class CalcExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc c1 = new Calc(25, 5);
		c1.printval();
		System.out.println("****************************************");
		Calc c2 = new Calc(15, 3);
		c2.printval();
		System.out.println("****************************************");
		Calc c3 = new Calc(125, 17);
		c3.printval();
		System.out.println("****************************************");
		
		
	}

}
