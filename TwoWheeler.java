package week1.day2.assignments;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 9876543210L;
	boolean isPunctured = true;
	String bikeName = "Honda";
	double runningKM = 1000.0088;
	
	public static void main(String[] args) {
		 TwoWheeler obj = new TwoWheeler();
		System.out.println(obj.noOfWheels);
		
		short noOfMirrors2 = obj.noOfMirrors;
		System.out.println(noOfMirrors2);
	
		System.out.println(obj.chassisNumber);
		
		System.out.println(obj.isPunctured);
		
		String bikeName2 = obj.bikeName;
		System.out.println(bikeName2);
		
		System.out.println(obj.runningKM);
	}
	
	
}
