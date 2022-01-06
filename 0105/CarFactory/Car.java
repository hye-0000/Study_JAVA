package CarFactory;

public class Car {
	
	public static int carSerialNum = 10000;
	private int carNum;
	
	public Car() {
		carSerialNum++;
		carNum = carSerialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}
