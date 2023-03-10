package chapter11;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";		
		
//		두 가지 형태가 제공된다.
//		substring(int beginIndex, int endIndex) 주어진 시작(포함)과 끝(제외) 출력
//		substring(int beginIndex) 주어진 인덱스부터 끝까지 출력
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
//		--------------------substr(0, 4)
		System.out.println();
	}
}
