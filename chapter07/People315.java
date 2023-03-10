package chapter07;

class People{
	String name;
	String ssn;
	
	People(){
	}
	
	People(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
}

class Student extends People{
	int studentNo;
	
	Student(String name, String ssn, int studentNo){
//		super(name, ssn);
		this.studentNo = studentNo;
	}
}

public class People315 {
	public static void main(String[] args) {
		Student student1 = new Student("홍길동", "123456-1234567", 100);
		Student student2 = new Student("김길동", "654321-7654321", 90);
		People student3 = new People("구기현", "this test");
		
		System.out.printf("%s\n%s\n%d", student1.name, student1.ssn, student1.studentNo);
		System.out.printf("\n%s\n%s\n%d", student2.name, student2.ssn, student2.studentNo);
	}
}
