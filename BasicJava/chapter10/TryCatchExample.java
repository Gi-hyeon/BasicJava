package chapter10;

public class TryCatchExample {
	public static void main(String[] args) {
		//ctrl + e ->  try Catch 선택
//		Class.forName("java.lang.String");
		try {
			System.out.println("실행 시작");
			Class.forName("java.iang.String");   // 맨 아래 에러발생 클릭 후 수정
//			Class.forName("java.lang.String");
			System.out.println("실행끝");
//			return;
		} catch (ClassNotFoundException e) { // e : 발생한 오류에 대한 정보가 담겨있음
			e.printStackTrace(); // 에러 프린트   stack First in -> Last out  / 에러는 맨 아래에서부터 확인하는 것이 좋다
			System.out.println("패키지명이나 클래스 이름이 올바르지 않습니다. 다시 입력하세요.");
		} finally { // 중간에 리턴이 명령문이 실행되도 무조건 finally 실행함
//			finally가 있는 이유? 자원을 쓰면 반납을 해야하는 존재 scanner.close()
			System.out.println("final");
		}
	}
}
