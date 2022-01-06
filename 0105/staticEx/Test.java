package staticEx;

public class Test {

	public static void main(String[] args) {
		/*
		Employee employeeLee = new Employee();
		
		employeeLee.setEmployeeName("이가나");
		
		System.out.println(employeeLee.serialNum);
		
		Employee employeeKim = new Employee();		
		employeeKim.setEmployeeName("김가나");
		
		System.out.println(employeeKim.getEmployeeName() + "의 사번은 " + employeeKim.getEmployeeID());
		*/
		
		//static 변수, 메소드는 클래스 이름을 참조해서 사용한다
		System.out.println(Employee.serialNum);
	}

}
