package CarFactory;

public class Test {

	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		Car mycar = factory.CreateCar(); //���⼭ ��ü ����
		
		System.out.println(mycar.getCarNum());

	}

}
