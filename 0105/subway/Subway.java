package subway;

public class Subway {
	int SubwayNum;
	int passenger;
	int money;
	
	public Subway(int SubwayNum) {
		this.SubwayNum = SubwayNum;
	}
	
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	public void showSubwayInfo() {
		System.out.println(SubwayNum + "ȣ���� �°� ���� " + passenger + "��, ������ " + money + "��");
	}
}
