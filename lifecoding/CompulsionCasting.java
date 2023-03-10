package lifecoding;

class Parents{
	String field1;
	void method1() {
		System.out.println("Parents method1");
	}
	void method2() {
		System.out.println("Parents method2");
	}
}

class Child extends Parents{
	String field2;
	@Override
	void method2() {
		System.out.println("Override method");
	}
	void method3() {
		System.out.println("Child method");
	}
}

public class CompulsionCasting {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
//		Parents parents = new Child();  
//		Child child = (Child)parents;   // 강제타입 옳은 방식 자식 타입이 부모 타입으로 옳바르게 변환되어 있어야함 
//		child.method3();
		
		
//		자식 타입이 부모 타입으로 변환되어 있는 상태에서만 가능 -> 부모 변수가 참조하는 객체가 부모 객체인지 자식 객체인지 확인하는 방법 instanceof
//		boolean result = 좌항(객체) instanceof 우항(타입)
//		child.method1() = "Test";   X 부모 메서드 접근 불가능 
//		child.field2 = "Test"; 오류 발생 안함 
//		child.method3();   O 접근 가능
		
		
//		Parents parents = new Parents();
//		Child child = (Child)parents; 개고생 -> 강제 타입 변환은 자식 타입이 부모 타입으로 변환되어 있는 상태에서만 가능하기 때문 ClassCastException
	}
}
