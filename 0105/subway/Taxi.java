package subway;

public class Taxi {
	String TaxiCompanyName;
	int money;
	
	public Taxi(String CompanyName) {
		this.TaxiCompanyName = CompanyName; 
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiInfo() {
		System.out.println(TaxiCompanyName + " ������ " + money +"�� �Դϴ�.");
	}
}