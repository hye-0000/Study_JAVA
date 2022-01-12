package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("½Ãµ¿À» ÄÔ");
	}
	
	public void turnOff() {
		System.out.println("½Ãµ¿À» ²û");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
