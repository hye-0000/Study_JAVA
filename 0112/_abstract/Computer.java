package _abstract;

public abstract class Computer {
	//�������� ����ϴ� �޼ҵ常 ����, ��ӹ��� �޼ҵ���� ����
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ Ŵ");
	}
	
	public void turnOff() {
		System.out.println("������ ��");
	}
}
