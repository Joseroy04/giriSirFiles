package testing;
class MobileDiscount{
	void disount() {
		System.out.println("Zero Discount");
	}
}
class Amazon extends MobileDiscount{
	void discount() {
		System.out.println("7.5% Discount");
	}
}

class Flipkart extends MobileDiscount{
	void discount() {
		System.out.println("20% Discount");
	}
}

public class Test09 {
	public static void main(String[] args) {
		MobileDiscount m1 = new MobileDiscount();
		m1.disount();
		Amazon m2 = new Amazon();
		m2.discount();
		Flipkart m3 = new  Flipkart();
		m3.discount();
	}
}
