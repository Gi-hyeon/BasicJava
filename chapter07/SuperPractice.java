package chapter07;

class SuperClass{
	int a = 15;
}

class SubClass extends SuperClass{
	int a = 10;
	
	void display() {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class SuperPractice {
	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		
		subClass.display();
	}
}
