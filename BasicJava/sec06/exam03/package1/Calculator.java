package sec06.exam03.package1;



public class Calculator {
	int value;
	
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	void run() {
		System.out.println("계산기 실행 완료");
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.value = 100;
		
		System.out.println("1");
//		value = 10; <- x 할 수 없다
	}
}
