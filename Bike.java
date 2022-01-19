package testing;

public class Bike {
	String manufacturer;
	int model;
	int no_of_gears;
	boolean four_stroke;
	double mileage;
	String color;
	
	public void start() {
		System.out.println("Insert Key");
		System.out.println("press Self Start ");
		System.out.println("Accel");
	}
	
	public void accel() {
		System.out.println("Consume");
	}
	public void gearup() {
		System.out.println("Increase the speed");
	}
	public void geardown() {
		System.out.println("Decrease the speed");
	}
	public void brake() {
		System.out.println("Make zero speed asap");
	}
	public void blowhorn() {
		System.out.println("GOPI");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("STOP");
	}
	
}
