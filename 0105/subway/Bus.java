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
		System.out.println(busNum + "번의 승객 수는 " + passenger + "명, 수입은 " + money + "원");
	}
}
