package testing;

public class BikeEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike yamaha = new Bike();
		yamaha.color="Yellow";
		yamaha.four_stroke=true;
		yamaha.manufacturer="Yamaha";
		yamaha.no_of_gears=5;
		yamaha.start();
		yamaha.accel();
		yamaha.gearup();
		yamaha.geardown();
		yamaha.stop();
		
		Bike tvs = new Bike();
		tvs.color="Yellow";
		tvs.four_stroke=true;
		tvs.manufacturer="tvs";
		tvs.no_of_gears=5;
		tvs.start();
		tvs.accel();
		tvs.gearup();
		tvs.geardown();
		tvs.stop();
	}

}
