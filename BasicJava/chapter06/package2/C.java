package chapter06.package2;

import chapter06.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; -> 다른 패키지 default
//		a.field3 = 1; -> 다른 패키지 private
		
		a.method();
//		a.method2(); -> ㄷㅇ
//		a.method3(); -> ㄷㅇ
	}
//	A a; 다른패키지에서 불러올 수 없다 default
//	A a1 = new A(true);
//	A a2 = new A(1);  -> default라 다른패키지에서 불러올 수 없 
//	A a3 = new A("문자열"); private라 당연히 다른패키지에서 불러올 수 없
}
