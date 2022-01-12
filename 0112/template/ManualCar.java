package template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		
		System.out.println("사람이 주행 중");
	}

	@Override
	public void stop() {
		
		System.out.println("장애물을 만나 브레이크로 멈춤");
	}

}
