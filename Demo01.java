package testing;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Car TN01AC1111 = new Car();
/*		TN01AC1111.automatic=true;
		TN01AC1111.electric=false;
		TN01AC1111.maxSpeed=220;
		TN01AC1111.model=2021;
		TN01AC1111.companyName="Ford";
*/		
		int maxspeed,mod;
		boolean auto, ele;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the model");
		mod = sc.nextInt();
		System.out.println("Enter the maxSpeed");
		maxspeed = sc.nextInt();
		System.out.println("Is it Electrical vehicle");
		ele = sc.nextBoolean();
		System.out.println("Is it auto vehicle");
		auto = sc.nextBoolean();
		
		int price = 0;
		price = TN01AC1111.calcPrice(maxspeed, mod, ele, auto);
		System.out.println(price);
		price = TN01AC1111.calcPrice(240, 2015, false, false);
		System.out.println(price);
		price = TN01AC1111.calcPrice(180, 2010, true, true);
		System.out.println(price);
		price = TN01AC1111.calcPrice(160, 2000, false, true);
		System.out.println(price);
		price = TN01AC1111.calcPrice(100, 2020, true, false);
		System.out.println(price);
		sc.close();
		TN01AC1111.startVehi();
		TN01AC1111.stopVehi();
	}
}
