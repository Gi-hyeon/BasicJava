package chapter10;

abstract class Animal{
	String Aname;
	public void sound() {
		System.out.println("동물");
	}
	
	public void Aanimal(){
		System.out.println("동물특징");
	}
	
	public abstract void Eat();
}

class Dog extends Animal{
	String Dname;
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("개");
	}

	public void Ddog() {
		System.out.println("개특징");
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("개가먹는다");
	}
}

class Cat extends Animal{
	String Cname;
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("고양이");
	}
	
	public void Ccat() {
		System.out.println("고양이특징");
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("고양이가먹는다");
	}
}

class Dolphin extends Animal{
	String Pname;
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("돌고래");
	}
	
	public void Ddolphin() {
		System.out.println("돌고래특징");
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("돌고래가먹는다");
	}
}









public class UpDownCasting {
	public static void main(String[] args) {
//		Animal animal1 = new Animal();
//		animal1.sound();
		
		Dog dog1 = new Dog();
		dog1.sound();
		
		Animal animal2 = new Dog(); //부모 탕비으로 자식을 가리킬 수 있다 -> 이 경우 부모가 가지고 있는 내용만 사용이 가능하다.
//		개가 가지고 있는 기능을 쓰고싶다. -> 형변환을 해줘야함
//		

		animal2.sound();
		animal2.Aanimal();
		animal2.Aname = "Aname";
		System.out.println("-----");
//		Dog dog2 = (Dog)animal2;
		if(animal2 instanceof Dog) {
			Dog dog2 = (Dog)animal2;
			System.out.println("성공");
			dog2.Dname = "1";
			dog2.Dname = "구찌";
			System.out.println(dog2.Aname);
			System.out.println(dog2.Dname);
			dog2.Aanimal();
			dog2.Ddog();
			dog2.Eat();
			System.out.println(dog2.Dname);
		}
		
//		if(dog2 instanceof Animal) {
//			Animal animal3 = (Animal)dog2;
//			System.out.println("성공");
//			System.out.println(animal3.Aname);
//			animal3.Aname = "달봉";
//			System.out.println(animal3.Aname);
//			animal3.Aanimal();
//		}
		
		Cat cat = new Cat();
		
		cat.Aanimal();
	}
}













































