package backjun;

class Person{
	String name;

	public Person(String name) {
		this.name = name;
	}
	
}

class Student extends Person{
	String check;
	
	public Student(String name) {
		super(name);
	}
	
}

public class Upcasting {
	public static void main(String[] args) {
//		Student student = new Student("홍길동");
//		Person per = student;
//		per.name = "이름";   -> 업캐스팅
		
		Person person = new Student("홍길동");
		System.out.println(person.name);
		
		Student student = (Student)person;
		student.check = "홍길동";
		student.name = "홍길동";
	}
}
