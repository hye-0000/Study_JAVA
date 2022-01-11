package polymorphism;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����δ�");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("����� �ȴ´�");
	}
	
	public void readBook() {
		System.out.println("����� å�� �д´�");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ȴ´�");
	}
	
	public void hunt() {
		System.out.println("ȣ���̰� ����Ѵ�");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("�������� ����");
	}
	
	public void fly() {
		System.out.println("�������� ������ ��� ����");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}
	
	public void moveAnimal(Animal animal){
		animal.move();
	}

}
