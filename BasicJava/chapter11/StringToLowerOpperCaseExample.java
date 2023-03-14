package chapter11;

public class StringToLowerOpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		System.out.println(lowerStr1);
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
		
//		equalsIgnoreCase를 사용하면 대소문자 맞추어야 할 작업이 생략된다.
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
