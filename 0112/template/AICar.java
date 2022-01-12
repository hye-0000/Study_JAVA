package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행 중");
	}
	
	@Override
	public void stop() {
		System.out.println("장애물을 만나 스스로 멈춤");
	}
}
