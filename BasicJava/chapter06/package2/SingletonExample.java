package chapter06.package2;

class Singleton{
	private String name;
	
	private static Singleton instance = new Singleton();    //statice으로 외부에서 접근가능하게 함 -> 필드니깐 private 붙여야함 -> getter로 필드 접근
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	//------------------------------------------------------------
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class SingletonExample {//싱글톤은 무분별하게 객체 생성하는 걸 막는다.
	public static void main(String[] args) {
		//new Singleton(); -> private로 변경하면 외부에서 객체 생성이 불가능하다.
		Singleton singletone1 = Singleton.getInstance();
		Singleton singletone2 = Singleton.getInstance();
		System.out.println(singletone1 == singletone2);
		
		singletone1.setName("홍길동");
		System.out.println(singletone2.getName());
	}
}
