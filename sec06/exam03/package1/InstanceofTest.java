package sec06.exam03.package1;

class Parent{
	
}

class Children extends Parent{
	
}

public class InstanceofTest {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Children children = new Children();
		
		System.out.println(parent instanceof Parent);
		System.out.println(children instanceof Parent);
	}
}
