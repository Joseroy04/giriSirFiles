package testing;

public class Car extends ClassParent_Vehi {
	String companyName;
	int model;
	boolean automatic;
	boolean electric;
	int price;
	int maxSpeed;
	
	int calcPrice(int model, int maxSpeed, boolean electric, boolean automatic) {
		if(electric==true) {
			if(automatic==true) {
				return model*100*10*maxSpeed;
			}
			else {
				return model*100*maxSpeed;
			}
		}
		else if(automatic==true){
			return model*10*maxSpeed;
		}
		else {
			return model*maxSpeed;
		}
	}
}
