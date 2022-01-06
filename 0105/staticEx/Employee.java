package staticEx;

public class Employee {
	
	public static int serialNum = 1000;
	
	private int employeeID;
	private String employeeName;
	private String department;
	
	//객체가 생성될 때 초기화 작업은 생성자에서
	public Employee() {
		serialNum++; 
		employeeID = serialNum;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
