package lifecoding;

class Parent1{
	
}

class Child1 extends Parent1{
	
}

public class InstanceofExample {
	public static void method1(Parent1 parent) {
		if(parent instanceof Child1) {
			Child1 child = (Child1)parent;     //자식은 작고 부모는 크다라고 생각해야한다.        같거나 상위타입 = new 같거나 하위타입   -> 3번째원칙 리스코프 치환 원칙
			System.out.println("method1 : Child 타입으로 변환 성공");
		} else {
			System.out.println("method1 : Child 타입으로 변환되지 않음");
		}
	}
	
	public static void method2(Parent1 parent) {
		Child1 child = (Child1)parent; 
		System.err.println("method2 : Child 타입으로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent1 parentA = new Child1();
		method1(parentA);
		method2(parentA);
		
		Parent1 parentB = new Parent1();
		method1(parentB);
		method2(parentB);
	
		
		run(new Child1()); // run Parent1 parent1 보다 같거나 작은 타입이 들어갈 수 있다 <- 런 안에는
		
	}
	
	Parent1 parent2 = new Child1();
	Child1 child1 = (Child1)parent2;
	
	
	static void run(Parent1 parent1) { //매개변수의 다형성
		
	}
}
