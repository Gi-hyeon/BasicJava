package chapter06.package1;

public class B{
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; -> 같은 패키지이지만 private라 안됌
		
		a.method();
		a.method2();
//		a.method3(); -> //
	}
//	A a1 = new A(true);
//	A a2 = new A(1);
//	A a3 = new A("문자열"); -> private라 같은 클래스 에서만 접근이 가능
}
