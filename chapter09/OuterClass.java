package chapter09;

public class OuterClass {
	String name;
	void method() {
		System.out.println("Outer Class");
	}
//	OuterClass는 자바가 실행될 때 필요한 클래스 메타 정보를 method area에 올려둔다.
//	InnerClass는 OuterClass처럼 method area에 정보를 올리지 않는다.
//	OuterClass가 생성되어야만 InnerClass를 생성할 수 있다. -> OuterClass를 생성해야 method area에 올라간다. 
	interface NestedInterface{          //클래스 안에 중첩 인터페이스도 사용이 가능하다. 주로  ex) 버튼, 체크박스, 이벤트, UI이벤트처리 등 일회성
		void run();
	}
	
	class InstanceClass{
		String name;
		void method() {
			System.out.println("Outer Instance Class");
		}
	}
	
	static class InnerClass{ //static을 붙여서 사용하는 경우가 더 많으며 더 좋음 
		String name;
		
		void method() {
			System.out.println("Outer inner Class");
			String name = "홍길동";
			class LocalClass extends Thread{ //일회용 같은 느낌
				
			}
			LocalClass localClass = new LocalClass();
			localClass.start();
		}
	}
}
