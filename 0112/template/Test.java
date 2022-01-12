package template;

public class Test {

	public static void main(String[] args) {

		Car aiCar = new AICar();
		aiCar.run();
		
		Car mCar = new ManualCar();
		mCar.run();

	}

}
