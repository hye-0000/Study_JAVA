package subway;

public class Student {
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1400);
		this.money -= 1400;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1600);
		this.money -= 1600;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "�� ���� ���� " + money + "��");
	}
}
