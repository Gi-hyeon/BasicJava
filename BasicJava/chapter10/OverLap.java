package chapter10;
class A{
	public A(){
		System.out.println("A 객체 생성");
	}
	
	class B{
		B(){System.out.println("B 객체 생성");};
		int field1;
		void method1() {
			
		}
	}
	
	static class C{
		C(){System.out.println("C 객체 생성");};
		int field1;
		static int field2;
		void method1() { System.out.println("method1"); }
		static void method2() {}
	}
}



public class OverLap {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		
		
		A.C c = new A.C();
		c.field1 = 1;
		c.method1();
		
		
		System.out.println(c.field1);
		c.method1();
		
	
	}
}
