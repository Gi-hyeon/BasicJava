package homework;

public class Human {
	private String name;
	private int age;
	
	public Human() {
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "이름: " + this.name + ", 나이: " + this.age;
	}
}
