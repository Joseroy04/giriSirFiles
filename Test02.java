package testing;

public class Test02 {
    public static void main(String[] args) {
		int a, fact;
		fact=1;
		for(a=1;a<=12;a++) {
			fact=fact*a;			
		}
		System.out.println(fact);
		if(fact<1700) {
			System.out.println("Arun");
		}
		else {
			System.out.println("Giri");
		}
	}
}
