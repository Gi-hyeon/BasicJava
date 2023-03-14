package chapter09;

class Person{
	void wake() {
		System.out.println("7시에 일어납니다.");
	}
}

class Anonymous{
	Person field = new Person() {
		String workk = "합니다";
		
		void work() {
			System.out.println("출근" + workk);
		}
		
		void wake() {
			System.out.println("6시에 일어난다.");
			work();
		};
	};
}

public class AnonymousExample {
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		anony.field.wake();
	}
}
