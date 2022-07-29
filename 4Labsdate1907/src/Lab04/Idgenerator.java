package Lab04;

public class Idgenerator {
	
private static long customerId=1000;
	
	public long getCustomerIdgen() {
		return customerId++;
	}
private static long employeeId=100;
	
	public long getEmployeeIdgen() {
		return employeeId++;
	}

}
