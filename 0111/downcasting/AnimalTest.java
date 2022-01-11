package downcasting;

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
		
		AnimalTest test = new AnimalTest();
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
		
		test.testDownCasting(animalList);
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i= 0; i<list.size();i++) {
			
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunt();
			}
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.fly();
			}
			else {
				System.out.println("unsupproted type");
			}
		}
	}
	public void moveAnimal(Animal animal){
		animal.move();
	}

}
