package CarFactory;

public class Test {

	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		Car mycar = factory.CreateCar(); //여기서 객체 생성
		
		System.out.println(mycar.getCarNum());

	}

}
