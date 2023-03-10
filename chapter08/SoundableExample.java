package chapter08;

interface Soundable{
	String sound();
}

class Cat implements Soundable{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "야옹";
	}
	
}

class Dog implements Soundable{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "멍멍";
	}
	
}


public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
