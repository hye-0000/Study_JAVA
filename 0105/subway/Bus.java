package subway;

public class Bus {
	int busNum;
	int passenger;
	int money;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	public void showBusInfo() {
		System.out.println(busNum + "���� �°� ���� " + passenger + "��, ������ " + money + "��");
	}
}
