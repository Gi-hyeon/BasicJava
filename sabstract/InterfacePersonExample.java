package sabstract;

interface A{
	void method();
}

class Member implements A{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("11인터페이스A를 구현한 클래스 Member의 method()호출됨");
	}
	
	public void method1() {
		System.out.println("11Member클래스 만 있는 method1()호출됨");
	}
	
}

class Person implements A{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("22인터페이스A를 구현한 클래스 Person의 method()호출됨");
	}
	
	public void method1() {
		System.out.println("22인터페이스를 구현한 클래스에서 새로 만든 메서드입니다.");
	}
	
}

public class InterfacePersonExample {
	public static void main(String[] args) {
		A a = new Person();
		Person person = new Person();
		person.method();
		person.method1();
		System.out.println("===============");
		Person person2 = (Person)a;
		person2.method();
		person2.method1();
		System.out.println("===============");
		a.method();
	}
}






























