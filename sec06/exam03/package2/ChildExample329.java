package sec06.exam03.package2;

class Parent{
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() Call");
	}
	
	public Parent(String nation) {
		super();
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}

class Child extends Parent{
	private String name;
	
	public Child() {
		//super(); 생략
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name  = name;
		System.out.println("Cild(String name) call");
	}
}

public class ChildExample329 {
	public static void main(String[] args) {
		Child child = new Child();
	}
}
