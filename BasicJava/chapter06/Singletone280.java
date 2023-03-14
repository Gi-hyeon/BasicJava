package chapter06;

class Earth{
//	private static Singleton singleton = new Singleton();
//	
//	private Singleton() {
//		
//	}
//	
//	static Singleton getInstance() {
//		return singleton;
//	}
	
//	final String nation = "대한민국";
//	final String ssn;
//	String name;
//	
//	public Person(String ssn, String name) {
//		this.ssn = ssn;
//		this.name = name;
//	}
//	----------------------------------
//	static final double earthRadius = 6400;
//	static final double earthArea = 4 * Math.PI * earthRadius * earthRadius;
//		
}

class Shopservice{
	private static Shopservice singleton = new Shopservice();
	//싱글톤 정적 필드
	
	private Shopservice() {
		
	}
	//생성자 외부 유입 방지
	
	static Shopservice getInstance() {
		return singleton;
	}
	
}

public class Singletone280 {
	public static void main(String[] args) {
		Shopservice obj1 = Shopservice.getInstance();
		Shopservice obj2 = Shopservice.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("동일");
		}
		
		
		
		
		
		
		
//		---------
//		Earth earth = new Earth();
//		
//		System.out.println("지구의 반지름" + earth.earthRadius);
//		System.out.println("지구의 넓이" + earth.earthArea);
	
//		-------------------------
//		Person Person = new Person("114679-114679", "구기현");
//		
//		System.out.println(Person.name + Person.nation + Person.ssn);

//		------------
//		Singleton obj1 = Singleton.getInstance();
//		Singleton obj2 = Singleton.getInstance();		
		
//		if(obj1 == obj2) {
//			System.out.println("동일");
//		}
	}
}
