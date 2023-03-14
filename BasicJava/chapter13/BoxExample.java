package chapter13;

public class BoxExample {
	public static void main(String[] args) {
		
		Box<Integer> box = new Box<Integer>(100);    //<> 괄호 안에 쓰는 값에 따라 box. 타입이 다 바뀐다.
//		jdk 1.7 버전부터 생성시 제네릭 생략
//		제네릭은 실행이 될 때 타입을 결정한다.
//		Box<Member> box2 = new Box<Member>(new Member("1"));
		
		
		
//		method(new Box("1"));
//		method(new Box(true));
	}
	
	public static void method(Box box) {
//		String box1Value = box.getValue();
	}
}
