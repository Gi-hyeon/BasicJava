package sec06.exam03.package1;

class Animal{
	//동물이라면 다 하는데 정의할 수 없다
	void eat() {
	}
	void sound() {
	}
	void work() {
	}
}

class Dog extends Animal{
	@Override
	void eat() {
		System.out.println("개같이 먹기");
	}
	@Override
	void sound() {
		System.out.println("개소리 내기");
	}
	@Override
	void work() {
		System.out.println("개같이 움직이기");
	}
	void onlyDog() {
		System.out.println("dog");
	}
}

class Cat extends Animal{
	@Override
	void eat() {
		System.out.println("고양이같이 먹기");
	}
	@Override
	void sound() {
		System.out.println("고양이소리 내기");
	}
	@Override
	void work() {
		System.out.println("고양이같이 움직이기");
	}
	void onlyDog() {
		System.out.println("cat");
	}
}

public class ExamAnimal {
	public static void main(String[] args) {
		//공통적인 기능이 있는데 다시 하기 귀찮다 -> 
		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal[] animal = new Animal[] {
			dog, cat
		};
		for(int i=0; i<animal.length; i++) {
			animal[i].eat();
			if(animal[i] instanceof Dog) {
				Dog tmp = (Dog)animal[i];
				tmp.onlyDog();
				
			}
		}
		
	}
}




























