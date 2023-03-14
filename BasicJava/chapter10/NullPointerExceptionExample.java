package chapter10;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
//		일반 예외(Exception)
//		Class.forName("java.lang.String");
		
//		실행 예외(Runtime Exception)
		method(null);
//		-------------------------------
//		String name = null;
//		System.out.println(name.contains("홍"));
	}
	
	private static void method(String name) {
		System.out.println(name.contains("홍"));
		
//		-------------해결 방법        ,          equals는 
//		if(name != null) {              
			System.out.println(name.contains("홍"));
//		}
	}
}
