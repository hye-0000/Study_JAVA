package staticEx;

public class Employee {
	
	public static int serialNum = 1000;
	
	private int employeeID;
	private String employeeName;
	private String department;
	
	//��ü�� ������ �� �ʱ�ȭ �۾��� �����ڿ���
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
