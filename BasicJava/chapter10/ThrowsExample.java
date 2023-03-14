package chapter10;

public class ThrowsExample {
	
	
	
	public static void main(String[] args) throws Exception {
//		메소드에서 에러를 던지면 메인에서 에러가 발생한다 -> 여기서 Catch 혹은 throws로 처리 가능ㄴ
//		method();
//		--------------------------------------
//		예외를 발생시키기 => 예외를 만든다?
//		throw를 사용함 -> 에러 생성하여 던진다.
		throw new Exception();
		
		
		
		
	}
//	throws를 하면 가독성이 좋으나 처리할 수단이 필요하다. 필요하려면 스프링을 사양해야하고 지금 당장은 try catch로 감싸는 것이 더 좋다.
//	throws 콤마 찍고, 여러개 가능 ,   던지면 메인메소드에서 method() 오류 발생
//	public static void method() throws ClassNotFoundException, ClassCastException {
//		Class.forName("java.long.String");
//	}
	
	public static void method() throws Exception {
		Class.forName("java.Iong.String");
	}
}
