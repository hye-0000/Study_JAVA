package _abstract;

public abstract class Computer {
	//공통으로 사용하는 메소드만 구현, 상속받을 메소드들이 구현
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 킴");
	}
	
	public void turnOff() {
		System.out.println("전원을 끔");
	}
}
