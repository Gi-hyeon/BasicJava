package chapter06;

public class Tumbler {
	String color;
	int capacity;
	
	void design(String color, int capacity) {
		this.color = color;
		this.capacity = capacity;
		System.out.println(capacity + color);
	}
}
