package chapter05;

import java.util.Scanner;

class Test{
	
	static void m1() {
		
	}
	
	void m2() {
		
	}
	
	
}

public class ReferenceExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		int[] num = null;
		
		System.out.print("입력할 숫자의 개수는? ");
		int count = scanner.nextInt();
		num = new int[count];
		
		System.out.println(count + "개의 숫자를 입력하세요 ");
		for(int i=0; i<count; i++) {
			num[i] = scanner.nextInt();
		}
		for(int i=0; i<count; i++) {
			System.out.printf("%d", num[i]);
		}
		
		
		
		scanner.close();
		
//		String c = "홍길동";
//		String d = "홍길동";
//		String a = new String("홍길동");
//		String b = new String("홍길동");
//		
//		System.out.println(c == d);   //String pool -> Stirng literal로 생선한 것은 String pool로 들어간다.
//		System.out.println(a.equals(b));
		
		
		
//		Random random = null;         //변수는 선언과 초기화가 중요하다. 선언은 되어있다
		
//	    random = new Random();           //초기화
		
//		int ranNum = random.nextInt();
//		System.out.println(ranNum);
		
	
		
		
		
		
		
		
		
	}
}