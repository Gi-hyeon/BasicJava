package lifecoding;

class A{
	public String x() {
		return "A.x";
	}
	
	public String m() {
		return "M";
	}
}

class B extends A{
	@Override // 클래스 A의 메소드를 오버라이딩 함 => 객체 우선순위가 더 높다
	//같거나 상위타입 = new  같거나 작은타입
	public String x() {  //상위 클래스를 오버라이딩했기 때문에 A.x 출력하는 것이 아니라 B.x가 출력이 된다.
		return "B.x";
	}
	public String y() {
		return "y";
	}
}

class B2 extends A{
	@Override
	public String x() {
		return "B2.x";
	}
}

public class PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj = new B();  //클래스 B로 인스턴스를 만들었지만 인스턴스는 A의 데이터 타입을 가지고있다.
		// 클래스 B를 인스턴스화 시킨 OBJ변수를 사용하고 그 변수는 클래스 A의 행세를 하고있지만 메소드X는 class B에 소속되어있는 것을 사용
		// obj는 A 행세를 하고있기 때문에 class B에 y()호출은 할 수 없다.
		// 상위클래스에서 오버라이딩 했으면 인스터스화 시킨 클래스의 메소드를 실행한다.
		//
		//클래스 B로 인스턴스를 만들었지만 인스턴스가 클래스 A의 행세를 하기 때문에 클래스 A에 정의된 메소드만 실행할 수 있고
		//클래스 B에서 추가적으로 정의한 메소드들은 실행할 수 없다.
		//동시에 오버라이딩한 멤버의 동작방식은 그대로 유지
		A obj2 = new B2();
		B obj3 = new B();
		
		A a = new B();
		B b = (B)a;
		
		System.out.println(b.y() + "fffff");
		
		
		System.out.println(obj.m() + "1");
		
		System.out.println(obj.x());
		System.out.println(obj2.x());
		
		System.out.println(obj3.y());
		
		
		
	}
}
