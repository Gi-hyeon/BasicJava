package chapter11;

import java.util.Objects;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		
		
		System.out.println(Objects.hash("blue"));
	}
}
