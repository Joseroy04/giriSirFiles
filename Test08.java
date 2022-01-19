package testing;

class Test{
	float area(float rad) {
		return 3.14f*rad*rad;
	}
	int area(int a) {
		return a*a;
	}
	int area(int len, int bre) {
		return len*bre;
	}
	float area(float height, float bre) {
		return (float) (0.5*height*bre);
	}
}

public class Test08 {
	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println("Area of circle\t\t"+t1.area( 7.0f));
		System.out.println("Area of Square\t\t"+t1.area(25));
		System.out.println("Area of Rectangle\t"+t1.area(25, 15));
		System.out.println("Area of Triangle\t"+t1.area(2.5f, 3.5f));
	}

}
