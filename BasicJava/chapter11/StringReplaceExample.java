package chapter11;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		
//		정규 표현식(Regular Expression) 시간 남으면 설명해주심. regx
		String ssRstr = oldStr.replaceAll("자바", "JAVA");
		System.out.println(ssRstr);
	}
}
