package chapter11;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
//		-1값을 리턴하면 특정 문자열이 포함되어 있지 않다는 뜻
//		문자열의 인덱스 위치가 3부터 시작하기 때문이다.
//		가독성이 떨어진다.
//		if(subject.indexOf("자바") != -1) {
//			System.out.println("자바와 관련된 책이군요");
//		} else {
//			System.out.println("자바와 관련없는 책이군요");
//		}
//		---------------------------------------------------
		if(subject.contains("자바")) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}
}
