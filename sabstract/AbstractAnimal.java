//package sabstract;
//
//abstract class Animal{
//	public String Kind;
//	
//	public void breathe() {System.out.println("숨을 쉽니다.");}
//	
//	public abstract void sound();
//}
//
//class Dog extends Animal{
//	public Dog() {
//		this.Kind = "포유류";
//	}
//	
//	@Override
//	public void sound() {System.out.println("멍멍");}
//}
//
//class Cat extends Animal{
//	public Cat() {
//		this.Kind = "냥냥류";
//	}
//	
//	@Override
//	public void sound() {System.out.println("야옹");}
//}
//
//public class AbstractAnimal {
//	public static void main(String[] args) {
//		Dog dog = new Dog();
//		Cat cat = new Cat();
//		System.out.println(dog.Kind);
//		System.out.println(cat.Kind);
//		
//		Animal animal = new Dog();
//		System.out.println(animal.Kind);
//		animal.sound();
//		
//		animalSound(new Dog());
//		
//		}
//	public static void animalSound(Animal animal) {
//		animal.sound();
//	}
//}
