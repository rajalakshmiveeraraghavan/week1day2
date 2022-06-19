package week1.day2.assignments;

public class Car {

	public void applybrake() {
		System.out.println("brake is applied");
	}
	
	public void applygear() {
		System.out.println("Gear is applied");
	}
	
	public void switchonAC() {
		System.out.println("AC is turned on");
	}
	
	public void applyaccelerate() {
		System.out.println("Accelerator is applied");
	}
	
	public static void main(String[] args) {
		Car object = new Car();
		object.applybrake();
		
		object.applygear();
		
		object.switchonAC();
		
		object.applyaccelerate();
		
		}
	}

