package subway;

public class Test {

	public static void main(String[] args) {
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		Student studentE = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		studentJ.takeBus(bus100);
		
		Subway blueSubway = new Subway(1);
		studentT.takeSubway(blueSubway);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		blueSubway.showSubwayInfo();
		
		Taxi taxiGood = new Taxi("잘 간다 운수택시");
		studentE.takeTaxi(taxiGood);
		studentE.showInfo();
		taxiGood.showTaxiInfo();
		
	}
}
