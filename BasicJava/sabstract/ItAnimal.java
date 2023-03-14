package sabstract;

interface WaterLife {  //포유류, 조류, 어유에 공통점이 있는 애들만 따로 뽑아내기 위해 interface 사용.
	public abstract void waterMove();
}

abstract class Animal{
	abstract void eat();
	abstract void sound();
	abstract void move();
}

abstract class Mammalia extends Animal{
	void mammaliaPoint() {
		System.out.println("새끼를 낳는다");   //포유류 특징
	}
	
}

abstract class Pisces extends Animal{
	void piscesPoint() {
		System.out.println("물에서 산다");
	};
}

class Dog extends Mammalia{ //부모 모양이 정의되지 않은 부분에 있어서 생성이 될 수 없다. 그래서 정의해야한다. -> 포유류특징
	@Override
	void eat() {System.out.println("개같이 먹는다");}
	@Override
	void sound() {System.out.println("개같이 소리낸다");}
	@Override
	void move() {System.out.println("개같이 움직인다");}
}

class Cat extends Mammalia{
	@Override
	void eat() {System.out.println("고양이같이 먹는다");}
	@Override
	void sound() {System.out.println("고양이같이 소리낸다");}
	@Override
	void move() {System.out.println("고양이같이 움직인다");}
}

class Whale extends Mammalia implements WaterLife{
	@Override
	void eat() {System.out.println("고래같이 먹는다");}
	@Override
	void sound() {System.out.println("고래같이 소리낸다");}
	@Override
	void move() {System.out.println("고래같이 움직인다");}
	@Override
	public void waterMove() {
		System.out.println("고래는 물에서 산다.");
	}
}

class Shark extends Pisces{
	@Override
	void eat() {System.out.println("상어같이 먹는다");}
	@Override
	void sound() {System.out.println("상어같이 소리낸다");}
	@Override
	void move() {System.out.println("상어같이 움직인다");}
}

class Fish extends Pisces implements WaterLife{
	@Override
	void eat() {System.out.println("물고기같이 먹는다");}
	@Override
	void sound() {System.out.println("물고기같이 소리낸다");}
	@Override
	void move() {System.out.println("물고기같이 움직인다");}
	@Override
	public void waterMove() {
		// TODO Auto-generated method stub
		System.out.println("물고기는 물에서 산다.");
	}
}

//추상클래스는 상속을 받아서 기능을 확장, 인터페이스는 전체적인 틀을 잡거나 이렇게 만들라고 규칙을 만드는데 중점을 둔 설계도다
public class ItAnimal {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Whale whale = new Whale();
		Shark shark = new Shark();
		Fish fish = new Fish();
		
		Animal[] ani = new Animal[] {dog, cat, whale, shark, fish};
		Mammalia[] ma = new Mammalia[] {dog, cat, whale};
		Pisces[] pi = new Pisces[] {shark, fish};
		
		for(int i=0; i<ani.length; i++) {
			ani[i].eat();
		}
		
		for(int i=0; i<ma.length; i++) {
			ma[i].eat();
			ma[i].sound();
			ma[i].move();
		}
		
		for(int i=0; i<pi.length; i++) {
			pi[i].eat();
			pi[i].sound();
			pi[i].move();
		}
		
		WaterLife[] water = new WaterLife[] {whale, fish};
		for(int i=0; i<water.length; i++) {
			water[i].waterMove();
		}
	}
}
