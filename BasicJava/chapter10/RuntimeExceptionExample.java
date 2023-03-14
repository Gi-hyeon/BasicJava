package chapter10;

public class RuntimeExceptionExample { //RuntimeException 경험에 의거
//	public static void main(String[] args) {
//		String data1;
//		String data2;
//		try {
//			data1 = args[0];
//			data2 = args[1];
//		} catch (ArrayIndexOutOfBoundsException e) { //매개값의 수가 없을때
//			// TODO Auto-generated catch block
////			e.printStackTrace();   에러 오류 알려줌
//			System.out.println("실행 매개값의 수가 부족합니다.");
//			return;
//		} finally {
//		}
//		
//		try {
//			int value1 = Integer.parseInt(data1);
//			int value2 = Integer.parseInt(data2);
//			int result = value1 + value2;
//			System.out.println(result);
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			System.out.println("숫자로 변환할 수 없습니다.");
//		} finally {
//			System.out.println("다시 실행하세요");
//		}
//	}
	
	public static void main(String[] args) {
		String data1;
		String data2;
		
		
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (Exception e) {
			e.printStackTrace();	
		} finally {
			System.out.println("다시 실행");
		} 
//		catch (NumberFormatException || ArrayIndexOutOfBoundsException e) {
//			System.out.println("실행 매개값의 수가 부족합니다.");
//		} 똑같은 오류가 발생했을 때 연산자 사용도 방법이다
	}
}