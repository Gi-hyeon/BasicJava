package chapter06;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	//this 메모리에 생성했을 때 자기자신.
	// Design pattern : Telescoping Constructor Pattern
	
	Korean() {
		
	}
	
	Korean(String name){
		this.name = name;
	}
	
	Korean(String name, String ssn){
		
		this.name = name;
		this.ssn = ssn;
	}
}
