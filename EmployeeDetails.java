package week1.day2.assignments;

public class EmployeeDetails {

	public void printEmployeeName() {
	System.out.println("Arun,10001");}
	
	public String getEmployeeAddress() {
		String address = "Chennai";
		return address;
	}
	
	public double PrintEmployeeSalary(double a) {
		return a;
	}

	public long PrintEmployeeMobilenumber(long mobile) {
		return mobile;
	}
	
	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		obj.printEmployeeName();
		
		String employeeAddress = obj.getEmployeeAddress();
		System.out.println(employeeAddress);
		
		double printEmployeeSalary = obj.PrintEmployeeSalary(50000);
		System.out.println(printEmployeeSalary);
		
		long printEmployeeMobilenumber = obj.PrintEmployeeMobilenumber(9876554321L);
		System.out.println(printEmployeeMobilenumber);
	}
}
