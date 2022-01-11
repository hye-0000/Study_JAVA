package downcasting;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직인다");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 걷는다");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽는다");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 걷는다");
	}
	
	public void hunt() {
		System.out.println("호랑이가 사냥한다");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 난다");
	}
	
	public void fly() {
		System.out.println("독수리가 날개를 펴고 난다");
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
