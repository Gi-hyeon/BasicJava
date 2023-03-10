package sec06.exam03.package2;

class Person{
	final String nation = "korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

class Earth{
	static final double EARTH_RADIUS = 6400;  //이 필드는 객체마다 존재하지 않고 클래스에서만 존재한다. 상수는 모두 대문자, 글자 연결시 언더스코어(_) 붙여준다
	
	static final double EARTH_RADIUSS;
	static {
		EARTH_RADIUSS = 6400;
	}
	
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
}

public class EarthExample {
	public static void main(String[] args) {
		Person person = new Person("123456-1234567", "홍길동");
		
		System.out.println(person.nation);
		System.out.println(person.name);
		System.out.println(person.ssn);
			
		//java는 final 붙인다고 상수가 아니다 -> 유일한 값은 아니다.
		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적: " + Earth.EARTH_AREA + "km^2");
	}
}
