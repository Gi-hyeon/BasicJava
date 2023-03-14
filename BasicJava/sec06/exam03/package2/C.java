package sec06.exam03.package2;

import sec06.exam03.package1.A;

public class C {
	A a1 = new A(true);
	//A a2 = new A(1); -> default 생정자 접근 불가
	//A a3 = new A("문자열");  -> private 생성자 접근 불가로 컴파일 에러
	
	
	
	
	//A a = new A(); //public은 다른 package에서 접근이 가능하나 default는 불가능하다.
	
}
