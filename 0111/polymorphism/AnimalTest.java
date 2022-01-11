package polymorphism;

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
