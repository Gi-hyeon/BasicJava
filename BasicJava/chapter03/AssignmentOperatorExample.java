package chapter03;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result = " + result);
		
		result -= 5;
		System.out.println("result = " + result);
		
		result *= 3;
		System.out.println("result = " + result);
		
		result /= 5;
		System.out.println("result = " + result);
		
		result %= 3;
		System.out.println("result = " + result);
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
		System.out.printf("%d점은 %c등급입니다.", score, grade);
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println("\n" + z);
		// 연산하기 전 x는 1증가 x=11, y는 연산 후 1감소 y=20  ·31
		// while != true
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1 / var2;
		int var4 = (int)(var3*var2);
		System.out.println(var4);
	}
}
