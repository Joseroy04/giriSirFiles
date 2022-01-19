package testing;

public class Demo {
	public static void main(String[] args) {
		Human a1= new Human();
		a1.age=22;
		a1.country="USA";
		a1.Name="GOPI";
		a1.Non_veg=false;
		int result = a1.sum(50, 50);
		System.out.println(result+" is scored by "+a1.Name+" in AGILE Test");
	}
}
